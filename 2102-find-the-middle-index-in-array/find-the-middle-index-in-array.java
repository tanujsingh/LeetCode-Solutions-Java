class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < n; ++i) {
            leftSum += nums[i];
            rightSum = totalSum - leftSum + nums[i];
            if (leftSum == rightSum) return i;
        }
        return -1;
    }
}