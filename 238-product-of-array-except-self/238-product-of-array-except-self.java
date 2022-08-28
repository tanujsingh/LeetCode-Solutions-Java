class Solution {
   /* ------------------------------ T: O(n), S: O(1) -----------------------------------*/
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        
        for(int i = 1; i < n; ++i) {
            res[i] = res[i - 1]*nums[i - 1];
        }
        
        int num = 1;
        for(int i = n - 1; i >= 0; --i) {
            res[i] = res[i]*num;
            num = num*nums[i];
        }
        
        return res;
    }
}