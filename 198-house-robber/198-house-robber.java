class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] maxProfit = new int[n + 1];
        
        if(n == 0) {
            return 0;
        }
        maxProfit[n] = 0;
        maxProfit[n - 1] = nums[n - 1];
        
        for(int i = n - 2; i >= 0; --i) {
            maxProfit[i] = Math.max(maxProfit[i + 1], maxProfit[i + 2] + nums[i]);
        }
        
        return maxProfit[0];
    }
}