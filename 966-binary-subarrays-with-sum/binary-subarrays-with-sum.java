class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int count = 0;
        int prefixSum = 0;

        for (int i = 0; i < n; ++i) {
            prefixSum += nums[i];
            if (prefixSum == goal) {
                count++;
            }

            if (map.containsKey(prefixSum - goal)) {
                count += map.get(prefixSum - goal);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);

        }

        return count;
    }
}