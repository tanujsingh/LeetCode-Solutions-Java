class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int count = 0;
        int dp = 0;
        
        for(int i = 2; i < nums.length; ++i){
            if(nums[i - 1] - nums[i - 2] == nums[i] - nums[i - 1]){
                dp = 1 + dp;
                count += dp;
            } else{
                dp = 0;
            }
        }
        
        return count;
    }
}