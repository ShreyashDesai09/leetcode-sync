// LeetCode: 198. House Robber
class _198_house_robber {
    public int rob(int[] nums) {

        if (nums == null || nums.length == 0) return 0;
        
        if (nums.length == 1) return nums[0];
        
        int one = 0;
        int two = 0;
        for(int num : nums)
        {   

            int currentMax = Math.max(one + num , two);

            one = two;
            two = currentMax;


        }

        return two;
    }
}
