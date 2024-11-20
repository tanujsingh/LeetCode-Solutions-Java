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

        for (int num : prefix) {
            if (num == goal) {
                count++;
            }

            if (map.containsKey(num - goal)) {
                count += map.get(num - goal);
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return count;
    }
}