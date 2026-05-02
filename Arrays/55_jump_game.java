// LeetCode: 55. Jump Game
class _55_jump_game {
    public boolean canJump(int[] nums) {

        int farthest = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            
            if (i > farthest) 
                return false;
            
            if (i + nums[i] > farthest) 
                farthest = i + nums[i];
            
            if (farthest >= n - 1) 
                return true;

        }

        return farthest >= n - 1;
    }
}
