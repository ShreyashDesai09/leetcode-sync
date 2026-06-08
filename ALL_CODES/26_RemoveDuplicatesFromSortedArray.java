class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 1)
            return 1;
        if(nums.length == 0)
            return 0;

        int i = 1; 
        int count = 1;
        int check = nums[0];

        while(i < nums.length)
        {
            if(nums[i] > nums[count - 1])
            {
                nums[count] = nums[i];
                count++;
            }

            i++;
        }

        return count;

    }
}
