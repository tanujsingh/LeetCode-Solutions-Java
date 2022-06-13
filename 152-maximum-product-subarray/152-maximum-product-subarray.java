class Solution {
    public int maxProduct(int[] nums) {
        int left = 1;
        int right = 1;
        int ans = Integer.MIN_VALUE;
        
        for(int i = 0; i < nums.length; ++i) {
            left = left == 0 ? 1 : left;
            right = right == 0? 1: right;
            
            left *= nums[i];
            right *= nums[nums.length - i - 1];
            
            ans = Math.max(ans, Math.max(left, right));
        }
        
        return ans;
    }
}