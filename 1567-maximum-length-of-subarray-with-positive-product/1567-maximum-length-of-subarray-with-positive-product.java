class Solution {
    public int getMaxLen(int[] nums) {
        int posNum = 0, negNum = 0;
        int ans = 0;
        for(int i = 0; i < nums.length; ++i) {
            if(nums[i] == 0) {
                posNum = 0;
                negNum = 0;
            } else if (nums[i] > 0) {
                posNum++;
                negNum = negNum == 0 ? 0 : negNum + 1;
            } else {
                int temp = posNum + 1;
                posNum = negNum == 0 ? 0 : negNum + 1;
                negNum = temp;
            }
            
            ans = Math.max(ans, posNum);
        }
        
        return ans;
    }
}