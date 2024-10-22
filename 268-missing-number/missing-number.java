class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        int ans = -1;
        int n = nums.length;
        for (int num : nums) {
            seen.add(num);
        }
        for (int i = 0; i <= n; ++i) {
            if (!seen.contains(i)){
                ans = i;
            }
        }
        
        return ans;
    }
}