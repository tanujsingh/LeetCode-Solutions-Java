class Solution {
    public int minOperations(int[] nums, int x) {
        int maxLen = -1;
        int left = 0;
        int right = 0;
        int sumArr = 0;
        int winSum = 0;
        for(int num : nums) {
            sumArr += num;
        }
        
        while(left <= right && right < nums.length){
            winSum += nums[right++];
            
            while(left <= right && winSum > sumArr - x) {
                winSum -= nums[left++];
            }
            
            if(winSum == sumArr - x) {
                maxLen = Math.max(maxLen, right - left);
            }
        }
        
        return maxLen == -1 ? -1 : nums.length - maxLen;
    }
}