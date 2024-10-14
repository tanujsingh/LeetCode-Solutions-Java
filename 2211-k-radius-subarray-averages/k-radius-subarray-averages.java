class Solution {
    public int[] getAverages(int[] nums, int k) {
        if (k == 0) return nums;
        
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        
        if (n < 2*k + 1) return ans;
        
        long[] prefix = new long[n];
        prefix[0] = nums[0];
        
        for (int i = 1; i < n; ++i) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        ans[k] = (int) ((prefix[2*k])/(2*k + 1));
        for (int i = k + 1; i + k < n; ++i) {
            ans[i] = (int) ((prefix[i + k] - prefix[i - k - 1])/(2*k + 1)); 
        }
        
        return ans;
        
    }
}