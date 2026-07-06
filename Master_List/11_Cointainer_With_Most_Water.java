class Solution {
    public int maxArea(int[] height) {
        
        int left = 0;
        int right = height.length - 1;
        int count = 0;

        while(left < right)
        {
            int width = right - left;
            int pointer = Math.min(height[left], height[right]);
            int currentArea = width * pointer;
            
            if (currentArea > count) {
                count = currentArea;
            }
            
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return count;
    }
}
