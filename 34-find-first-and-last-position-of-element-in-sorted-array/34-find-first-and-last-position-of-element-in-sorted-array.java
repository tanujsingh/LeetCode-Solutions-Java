class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findTarget(nums, target, true);
        int last = findTarget(nums, target, false);
        return new int[]{first, last};
    }
    
    private int findTarget(int[] nums, int target, boolean isFirst){
        int left = 0;
        int right = nums.length - 1;
        
        while(left <= right) {
            int mid = left + (right - left)/2;
            
            if(nums[mid] == target) {
                if(isFirst) {
                    if(mid == 0 || nums[mid - 1] != target) {
                        return mid;
                    } else {
                        right = mid - 1;
                    }
                } else {
                    if(mid == nums.length - 1 || nums[mid + 1] != target) {
                        return mid;
                    } else {
                        left = mid + 1;
                    }
                }
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}