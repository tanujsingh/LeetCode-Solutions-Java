class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        int sumOfN = n * (n + 1) / 2;
        int sumOfNums = 0;    
        for (int i = 0; i < n; ++i) {
            sumOfNums += nums[i];
        }
        
        return sumOfN - sumOfNums;
    }
}