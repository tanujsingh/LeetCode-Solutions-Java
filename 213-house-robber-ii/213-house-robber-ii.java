class Solution {
    public int rob(int[] nums) {
      if (nums.length == 1) 
          return nums[0];
      if (nums.length == 2) {
          return Math.max(nums[0], nums[1]);
      }
       int include_1st = helper(nums, 0, nums.length - 2);
       int exclude_1st = helper(nums, 1, nums.length - 1);
        
       return Math.max(include_1st, exclude_1st);
    }
    
    private int helper(int[] nums, int start, int end) {
        int n = end - start;
        int[] dp = new int[n + 1];
        dp[0] = nums[start];
        dp[1] = Math.max(dp[0], nums[start + 1]);
        
        for(int i = start + 2; i <= end; ++i) {
            dp[i - start] = Math.max(dp[i - start - 1], 
                                     nums[i] + dp[i - start - 2]);
        }
        
        return dp[n];
    }
}