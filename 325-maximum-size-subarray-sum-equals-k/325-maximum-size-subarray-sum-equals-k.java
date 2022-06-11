class Solution {
    public int maxSubArrayLen(int[] nums, int k) {
       Map<Integer, Integer> map = new HashMap<>();
       map.put(0, -1);
       int currSum = 0, maxLen = 0;
       for(int i = 0; i < nums.length; ++i) {
           currSum += nums[i];
           if(map.containsKey(currSum - k)) {
               maxLen = Math.max(maxLen, i - map.get(currSum - k));
           }
           map.putIfAbsent(currSum, i);
       }
        return maxLen;
    }
}