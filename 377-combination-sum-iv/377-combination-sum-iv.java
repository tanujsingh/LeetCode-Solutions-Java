class Solution {
    private Map<Integer, Integer> memo = new HashMap<>(); 
    public int combinationSum4(int[] nums, int target) {
        Arrays.sort(nums);
        return totalCombinations(nums, target);
    }
    
    private int totalCombinations(int[] nums, int remain) {
        if(remain == 0) {
            return 1;
        }
        
        if(memo.containsKey(remain)) {
            return memo.get(remain);
        }
        
        int ans = 0;
        for(int num : nums) {
            if(remain - num >= 0) {
                ans += totalCombinations(nums, remain - num);
            }
        }
        
        memo.put(remain, ans);
        
        return ans;
    }
}