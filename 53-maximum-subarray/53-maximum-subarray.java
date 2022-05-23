class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int localSum = 0;
        for(int num : nums) {
            localSum = Math.max(num, localSum + num);
            if (localSum > maxSum) {
                maxSum = localSum;
            }
        }
        
        return maxSum;
    }
}