class Solution {
    public double findMaxAverage(int[] nums, int k) {

        if(nums.length == 0) return (double) nums[0];

        double sum = 0;

        for(int i = 0 ; i < k ; i++)
        {
            sum += nums[i]; 
        }

        double maxAvg = sum;

        for(int i = 1 ; i <= nums.length - k; i++)
        {
            sum += nums[i + k - 1] - nums[i- 1];
            
            if(sum > maxAvg)
                maxAvg = sum;

        }

        return maxAvg / k;

    }
}
