class Solution {
    public int reverse(int x) {
        boolean isNegative = x < 0;
        long reverse = 0;
        int finAns = 0;
        while(x != 0)
        {
            reverse = (reverse * 10) + (x % 10);
            x /= 10;
        }
        
        if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
            return 0;
        }

        finAns = (int) reverse;
        
        return finAns;
    }
}
