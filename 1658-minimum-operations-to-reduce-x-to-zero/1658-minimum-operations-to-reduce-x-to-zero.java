class Solution {
    public int minOperations(int[] nums, int x) {
        int sumArr = 0, curSum = 0;
        Map<Integer, Integer> memo = new HashMap<>();
        memo.put(0,-1);
        
        for (int num: nums) {
          sumArr += num;  
        } 

        if (sumArr == x) {
            return nums.length;
        }
        
        int target = sumArr - x, maxWindow = 0;

        for (int i = 0; i < nums.length; ++i){
            curSum += nums[i];
            
            memo.put(curSum,i);
            
            if (memo.containsKey(curSum - target))
                maxWindow = Math.max(maxWindow, i-memo.get(curSum - target));
        }
        
        return maxWindow > 0 ? (nums.length - maxWindow) : -1;
    }
}