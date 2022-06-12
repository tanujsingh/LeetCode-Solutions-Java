class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int left = 0, right = 0;
        int maxSum = 0;
        int localSum = 0;
        Set<Integer> set = new HashSet<>();
        while(right < nums.length) {
            if(!set.contains(nums[right])) {
                localSum += nums[right]; 
                set.add(nums[right++]);
                maxSum = Math.max(maxSum, localSum);
            } else {
                localSum -= nums[left];
                set.remove(nums[left++]);
            }
        }
        return maxSum;
    }
}