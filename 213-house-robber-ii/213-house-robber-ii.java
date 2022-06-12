class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        
        if(nums.length == 1) {
            return nums[0];
        }
        
        if(nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        
        int maxFirst = robScheme(nums, 0, nums.length - 1);
        int maxLast = robScheme(nums, 1, nums.length);
        
        return Math.max(maxFirst, maxLast);
    }
    
    private int robScheme(int[] nums, int begin, int end) {
        int n = end - begin;
        int[] dp = new int[n];
        dp[0] = nums[begin];
        dp[1] = Math.max(dp[0], nums[begin + 1]);
        
        for(int i = begin + 2; i < end; ++i) {
            dp[i - begin] = Math.max(dp[i - begin - 1],nums[i] + dp[i - begin - 2]);
        }
                
        return dp[n - 1];
    }
}