// LeetCode: 167. Two Sum II - Input Array Is Sorted
class _167_two_sum_ii_-_input_array_is_sorted {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while(left < right)
        {
            if(target == numbers[left] + numbers[right])
                return new int[]{left + 1 , right + 1} ;
            else if(target > numbers[left] + numbers[right])
                left++;
            else 
                right--;           
        }
        
        return new int[]{-1 , -1};
    }
}
