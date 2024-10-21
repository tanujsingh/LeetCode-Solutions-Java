class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int total = 0;


        for (int i = 0; i < n; ++i) {
            total += nums[i];
        }

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < n; ++i) {
            leftSum += nums[i];
            rightSum = total - leftSum + nums[i];
            if (leftSum == rightSum) return i;
        }
        return -1;
    }
}