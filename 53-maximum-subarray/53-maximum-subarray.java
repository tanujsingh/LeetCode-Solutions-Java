class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int localSum = 0;
        for(int num : nums) {
            localSum += num;
            maxSum = Math.max(maxSum, localSum);
            if (localSum < 0) {
                localSum = 0;
            }
        }
        
        return maxSum;
    }
}