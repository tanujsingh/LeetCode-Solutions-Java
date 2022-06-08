class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0) {
            return new int[]{-1,-1};
        }
        
        int[] res = new int[2];
        int n = nums.length;
        boolean begin = false;
        boolean end = false;
        for(int i = 0; i < n; ++i) {
            if(nums[i] == target && begin == false) {
                res[0] = i;
                begin = true;
            }
            
            if(nums[n - i - 1] == target && end == false) {
                res[1] = n - i - 1;
                end = true;
            }
        }
        return begin == false && end == false ? new int[]{-1,-1} : res;
    }
}