class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        return peak(nums, left, right);  
    }
    
    private int peak(int[] nums, int left, int right) {
        if(left == right) {
            return left;
        }
        
        int mid = left + (right - left)/2;
        
        if(nums[mid] > nums[mid + 1]){
            return peak(nums, left, mid);
        } else {
            return peak(nums, mid + 1, right);
        }
        
    }
}