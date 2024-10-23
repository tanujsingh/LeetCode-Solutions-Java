class Solution {
    public List<Integer> intersection(int[][] nums) {
        int n =nums.length;
        Map<Integer, Integer> count = new HashMap<>();
        
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < nums[i].length; ++j) {
                count.put(nums[i][j], count.getOrDefault(nums[i][j], 0) + 1);
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int key : count.keySet()) {
            if (count.get(key) == n) {
                ans.add(key);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}