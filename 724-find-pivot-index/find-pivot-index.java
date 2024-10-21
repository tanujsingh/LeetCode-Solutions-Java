class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int total = nums[0];
        int[] prefixSum = new int[n];
        prefixSum[0] = nums[0];


        for (int i = 1; i < n; ++i) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
            total += nums[i];
        }

        int left = 0;
        int right = 0;

        for (int i = 0; i < n; ++i) {
            left = prefixSum[i];
            right = total - left + nums[i];
            if (left == right) return i;
        }
        return -1;
    }
}