class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int currentSum = 0;
        int maxSum = 0;
        int left = 0;
        for (int right = 0; right < nums.length; ++right) {
            currentSum += nums[right];
            if (set.contains(nums[right])) {
                while (set.contains(nums[right])) {
                    set.remove(nums[left]);
                    currentSum -= nums[left++];
                }
            }
            maxSum = Math.max(maxSum, currentSum);
            set.add(nums[right]);
        }
        return maxSum;
    }
}
// Find the subarray with all unique elements and with the maximum Sum.