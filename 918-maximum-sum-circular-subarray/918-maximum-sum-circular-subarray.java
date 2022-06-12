class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        
        for(int num : nums) {
            totalSum += num;
        }
        
        int localSum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        for(int num : nums) {
            localSum += num;
            maxSum = Math.max(maxSum, localSum);
            
            if(localSum < 0) {
                localSum = 0;
            }
        }
        
        int localMinSum = 0;
        int minSum = Integer.MAX_VALUE;
        
        for(int num : nums) {
            localMinSum += num;
            minSum = Math.min(minSum, localMinSum);
            
            if(localMinSum > 0) {
                localMinSum = 0;
            }
        }
        
        return maxSum > 0 ? Math.max(maxSum, totalSum - minSum) : maxSum;
    }
}