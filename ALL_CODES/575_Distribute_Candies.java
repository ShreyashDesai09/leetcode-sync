class Solution {
    public int distributeCandies(int[] candyType) {
        int size = candyType.length / 2;

        Set<Integer> uniqueCandies = new HashSet<Integer>();

        for(int addCandy : candyType)
        {
            uniqueCandies.add(addCandy);
            if(uniqueCandies.size() == size)
                break;
        }

        if(uniqueCandies.size() < size)
            return uniqueCandies.size();
        else
            return size;
    }
}
