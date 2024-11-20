class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int count = 0;
        int[] prefix = new int[n];
        prefix[0] = nums[0];
        for (int i = 1; i < n; ++i) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        for (int i = 0; i < n; ++i) {
            if (prefix[i] == goal) {
                count++;
            }

            if (map.containsKey(prefix[i] - goal)) {
                count += map.get(prefix[i] - goal);
            }
            map.put(prefix[i], map.getOrDefault(prefix[i], 0) + 1);
        }

        return count;
    }
}