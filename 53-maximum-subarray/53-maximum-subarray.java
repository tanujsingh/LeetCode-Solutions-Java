class Solution {
    public int maxSubArray(int[] nums) {
        int sum = Integer.MIN_VALUE;
        int localSum = 0;
        for(int i = 0; i < nums.length; ++i) {
            localSum += nums[i];
            sum = Math.max(sum, localSum);
            
            if(localSum < 0) {
                localSum = 0;
            }
        }
        return sum;
    }
}