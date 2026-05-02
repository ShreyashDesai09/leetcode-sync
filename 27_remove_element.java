// LeetCode: 27. Remove Element
class _27_remove_element {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int count = 0;
        while(i < nums.length)
        {
            if(nums[i] != val)
            {
                nums[count] = nums[i];
                count++;
            }
            i++;
        }
        return count;
    }
}
