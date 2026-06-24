class Solution {
    public int hammingWeight(int n) {
        return countSetBits(n);
    }

    private int countSetBits(int num) {
        int count = 0;
        
        while (num != 0) {
            num = num & (num - 1); 
            count++;
        }
        
        return count;
    }
}
