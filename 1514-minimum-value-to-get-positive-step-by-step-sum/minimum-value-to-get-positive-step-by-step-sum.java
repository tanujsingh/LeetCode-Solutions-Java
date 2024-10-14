class Solution {
    public int minStartValue(int[] nums) {
        int[] prefix = new int[nums.length];
        int min = nums[0];
        prefix[0] = nums[0];

        for (int i = 1; i < nums.length; ++i) {
            prefix[i] = prefix[i - 1] + nums[i];
            min = Math.min(min, prefix[i]);
        }

        return min >= 1 ? 1 : -min + 1;
    }
}