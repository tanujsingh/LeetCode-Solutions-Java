class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        
        if(n == 0) {
            return 0;
        }
        int robNextPlusOne = 0;
        int robNext = nums[n - 1];
        
        for(int i = n - 2; i >= 0; --i) {
            int robCurr = Math.max(robNext, robNextPlusOne + nums[i]);
            robNextPlusOne = robNext;
            robNext = robCurr;
        }
        
        return robNext;
    }
}