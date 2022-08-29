class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        
        while (left < right) {
            int mid = left + (right - left)/2;
            
            if(nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        
        int rotation = left;
        left = 0;
        right = n - 1;
        
        while(left <= right) {
            int mid = left + (right - left)/2;
            int newMid = (mid + rotation)%n; 
            if(nums[newMid] == target) {
                return newMid;
            } else if (nums[newMid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return -1;
    }
}