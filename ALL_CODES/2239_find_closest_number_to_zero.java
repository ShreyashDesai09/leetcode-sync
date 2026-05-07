// LeetCode: 2239. Find Closest Number to Zero
class _2239_find_closest_number_to_zero {
    public int findClosestNumber(int[] nums) {
        
        int ans = nums[0];
        

        for(int i = 1 ; i < nums.length ; i++)
        {

            if(Math.abs(nums[i]) < Math.abs(ans) )
            {
               ans = nums[i];
            }
            
            else if(Math.abs(nums[i]) == Math.abs(ans))
                {
            
                    if(nums[i] > ans)
                    {
                        ans = nums[i];
                    }
             
                }
             
        }

        return ans;
    }
}