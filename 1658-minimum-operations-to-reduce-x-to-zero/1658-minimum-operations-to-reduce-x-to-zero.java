class Solution {
    public int minOperations(int[] nums, int x) {
        int maxWindow = -1;
        int left = 0;
        int right = 0;
        int sumArr = 0;
        int currSum = 0;
        
        for(int num : nums) {
            sumArr += num;
        }
        
        if(sumArr == x) {
            return nums.length;
        }
        
        while (left <= right && right < nums.length) {
            currSum += nums[right++];
            
            while (left <= right && currSum > sumArr - x) {
                currSum -= nums[left++];
            }
            
            if(currSum == sumArr - x) {
                maxWindow = Math.max(maxWindow, right - left);
            }
        }
        
        return maxWindow == -1 ? -1 : nums.length - maxWindow;
    }
}