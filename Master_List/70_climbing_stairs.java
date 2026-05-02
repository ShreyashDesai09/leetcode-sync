// LeetCode: 70. Climbing Stairs
class _70_climbing_stairs {
    public int climbStairs(int n) {
        if(n <= 2)
            return n; 
        
        int one = 1;
        int two = 2;

        for(int i = 3 ; i <= n ; i++)
        {
            int third = one + two;
            one = two;
            two = third;
        }

        return two;

    }
}
