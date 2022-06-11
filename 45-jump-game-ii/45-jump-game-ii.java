class Solution {
    public int jump(int[] nums) {
        if(nums.length == 1) {
            return 0;
        }
        
        int left = 0;
        int right = nums[0];
        int count = 1;
        
        while (left <= right) {
            if(right >= nums.length - 1) {
                return count;
            }
            
            int maxJump = 0;
            
            while(left <= right) {
                maxJump = Math.max(maxJump, left + nums[left]);
                left++;
            }
            
            if(maxJump > right) {
                left = right;
                right = maxJump;
                count++;
            }
        }
        
        return -1;
    }
}