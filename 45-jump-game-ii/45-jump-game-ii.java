class Solution {
    public int jump(int[] nums) {
        int currJump = 0, maxJump = 0;
        int minJump = 0;
        for(int i = 0; i < nums.length - 1; ++i) {
            maxJump = Math.max(maxJump, i + nums[i]);
            
            if(currJump == i) {
                minJump++;
                currJump = maxJump;
            }
        }
        return minJump;
    }
}