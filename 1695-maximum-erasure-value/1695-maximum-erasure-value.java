class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n = nums.length;
        int maxSum = 0;

        Map<Integer, Integer> map = new HashMap<>();
        
        int[] prefixSum = new int[n + 1];
        
        int left = 0, right = 0;
        while(right < n) {
            prefixSum[right + 1] = prefixSum[right] + nums[right];
                            
            if(map.containsKey(nums[right])) {
                left = Math.max(left, map.get(nums[right]) + 1);
            }
            
            maxSum = Math.max(maxSum, prefixSum[right + 1] - prefixSum[left]);
            map.put(nums[right], right);
            
            right++;
        }
        
        return maxSum;
    }
}