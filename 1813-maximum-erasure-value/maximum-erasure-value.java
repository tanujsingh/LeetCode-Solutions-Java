class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int currentSum = 0;
        int maxSum = 0;
        int left = 0;
        for (int right = 0; right < nums.length; ++right) {
            while (set.contains(nums[right])) {
                set.remove(nums[left]);
                currentSum -= nums[left++];
            }
            currentSum += nums[right];
            set.add(nums[right]);
            maxSum = Math.max(maxSum, currentSum);

        }
        return maxSum;
    }
}
// Find the subarray with all unique elements and with the maximum Sum.