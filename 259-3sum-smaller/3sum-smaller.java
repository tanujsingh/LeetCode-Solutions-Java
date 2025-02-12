class Solution {
    public int threeSumSmaller(int[] nums, int target) {
        int ans = 0;
        int n = nums.length;
        Arrays.sort(nums);

        for(int i = 0; i < n - 2; ++i) {
            ans += twoSumSmaller(nums, i + 1, target - nums[i]);
        }

        return ans;
    }

    public int twoSumSmaller(int[] nums, int left, int newTarget) {
            int res = 0;
            int right = nums.length - 1;

            while (left < right) {
                if (nums[left] + nums[right] < newTarget) {
                    res += right - left;
                    left++;
                } else {
                    right--;
                }
            }

            return res;
     }
}