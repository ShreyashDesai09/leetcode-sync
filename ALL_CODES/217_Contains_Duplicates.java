class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> check = new HashSet<Integer>();
        for(int num : nums)
        {
            if(!check.add(num))
                return true;
        }
        return false;
    }
}
