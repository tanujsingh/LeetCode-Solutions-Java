class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        
        left[0] = 1;
        for(int i = 1; i < n; ++i) {
            left[i] = left[i - 1]*nums[i - 1];
        }
        
        right[n - 1] = 1;
        for(int i = n - 2; i >= 0; --i) {
            right[i] = right[i + 1]*nums[i + 1];
        }
        
        for(int i = 0; i < n; ++i) {
            nums[i] = left[i]*right[i];
        }
        
        return nums;
    }
    
    /* ------------------------------ T: O(n), S: O(1) -----------------------------------*/
    /*
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
    */
    
    /* ------------------------------ Brute Force -----------------------------------*/
    /*
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res,1);
        for(int i = 0; i < n; ++i) {
            for(int j = n - 1; j >= 0; --j) {
                if(i == j) {
                    continue;
                } else {
                    res[i] *= nums[j]; 
                }
            }
        }
        return res;
    }
    */
}