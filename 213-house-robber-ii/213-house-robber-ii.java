class Solution {
    public int rob(int[] nums) {
      if (nums.length == 1) 
          return nums[0];
       int include_1st = nums[0] + helper(nums, 2, nums.length - 2);
       int exclude_1st = helper(nums, 1, nums.length - 1);
        
       return Math.max(include_1st, exclude_1st);
    }
    
    private int helper(int[] nums, int start, int end) {
        int prev_last2 = 0;
        int prev_last1 = 0;
        
        for(int i = start; i <= end; ++i) {
            int curr = Math.max(prev_last1, prev_last2 + nums[i]);
            int temp = prev_last1;
            prev_last1 = curr;
            prev_last2 = temp;
        }
        
        return prev_last1;
    }
}