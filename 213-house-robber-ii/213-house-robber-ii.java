class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        if(n == 2) return Math.max(nums[0], nums[1]);
        
        int maxFirst = helper(nums, 0, nums.length - 1);
        int maxLast = helper(nums, 1, nums.length);
        
        return Math.max(maxFirst, maxLast);
    }
    
     private int helper(int[] nums, int begin, int end) {
        int n = end - begin;
        int[] dp = new int[n];
        dp[0] = nums[begin];
        dp[1] = Math.max(dp[0], nums[begin + 1]);
        
        for(int i = begin + 2; i < end; ++i) {
            dp[i - begin] = Math.max(dp[i - begin - 1],
                                     nums[i] + dp[i - begin - 2]);
        }
                
        return dp[n - 1];
    }
}