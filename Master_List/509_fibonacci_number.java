// LeetCode: 509. Fibonacci Number
class _509_fibonacci_number {
    public int fib(int n) {
        int one = 0;
        int two = 1;
        int ans = 0;

        if (n <= 1) return n;

        for(int i = 0 ; i < n - 1 ; i++)
        {
            ans = one + two;
            one = two;
            two = ans;
            if(i == n)
            {
                break;
            }
            else 
                continue;

        }
        return ans;
    }
}
