class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int maxLengthSubArray = 0;

        for (int right = 0; right < nums.length; ++right) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            while (map.get(nums[right]) > k) {
                map.put(nums[left], map.getOrDefault(nums[left], 0) - 1);
                left++;
            }

            maxLengthSubArray = Math.max(maxLengthSubArray, right - left + 1);

        }
        return maxLengthSubArray;
    }
}