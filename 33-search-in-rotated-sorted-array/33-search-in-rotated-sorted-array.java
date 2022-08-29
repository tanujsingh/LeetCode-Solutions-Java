class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        
        if(left == right) return target == nums[0] ? 0 : -1;
    
        while(left <= right) {
            int mid = left + (right - left)/2;
            if(mid < n - 1 && nums[mid] > nums[mid + 1]) {
                left = mid + 1;
                break;
            }
            
            if(mid > 0 && nums[mid] < nums[mid - 1]) {
                left = mid;
                break;
            }
            
            if(nums[mid] > nums[0]) {
                left = mid + 1;
            } else {
                right = mid - 1;
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