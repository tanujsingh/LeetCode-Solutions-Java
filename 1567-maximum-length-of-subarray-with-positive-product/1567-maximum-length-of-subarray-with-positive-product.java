class Solution {
    public int getMaxLen(int[] nums) {
        int negIndex = -1;
        int zeroIndex = -1;
        int negSum = 0;
        int len = 0;
        for(int i = 0; i < nums.length; ++i) {
            if(nums[i] < 0) {
                negSum++;
                
                if(negIndex == -1) {
                    negIndex = i;
                }
            }
            
            if(nums[i] == 0) {
                negSum = 0;
                negIndex = -1;
                zeroIndex = i;
            } else {
                if(negSum%2 == 0) {
                    len = Math.max(i - zeroIndex, len);
                } else {
                    len = Math.max(i - negIndex, len);
                }
            }
        }
        
        return len;
    }
}