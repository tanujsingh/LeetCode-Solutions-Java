class Solution {
    public int maxSubArrayLen(int[] nums, int k) {
       Map<Integer, Integer> map = new HashMap<>();
       map.put(0, -1);
       int currSum = 0, maxLen = 0;
       for(int i = 0; i < nums.length; ++i) {
           currSum += nums[i];
           maxLen = Math.max(maxLen, i - map.getOrDefault(currSum - k, i));
           map.putIfAbsent(currSum, i);
       }
        return maxLen;
    }
}