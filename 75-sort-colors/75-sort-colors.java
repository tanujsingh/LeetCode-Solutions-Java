class Solution {
    public void sortColors(int[] nums) {
        int[] sortedColors = new int[nums.length];
        Arrays.fill(sortedColors, 1);
        int left = 0;
        int right = nums.length - 1;
        for(int num : nums) {
            if(num == 0) {
                sortedColors[left++] = 0;
            } else if (num == 2) {
                sortedColors[right--] = 2;
            }
        }
        for (int i = 0; i < nums.length; ++i) {
            nums[i] = sortedColors[i];
        }
    }
}