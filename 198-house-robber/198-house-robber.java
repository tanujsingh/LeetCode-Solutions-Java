class Solution {
    int[] memo;
    public int rob(int[] nums) {
        int n = nums.length;
        this.memo = new int[n + 1];
        Arrays.fill(memo, -1);
        return helper(0, nums);
    }
    
    private int helper(int i, int[] nums) {
        if(i >= nums.length) return 0;
        if(memo[i] != -1) return memo[i];
        memo[i] = Math.max(helper(i + 1, nums), helper(i + 2, nums) + nums[i]);
        return memo[i];
    }
}