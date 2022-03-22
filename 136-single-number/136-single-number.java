class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int sumAll = 0;
        int sumSet = 0;
        
        for(int i = 0; i < nums.length; ++i) {
            if(!set.contains(nums[i])) {
                set.add(nums[i]);
                sumSet += nums[i];
            }
            sumAll += nums[i];
        }
        return 2*(sumSet) - sumAll; 
    }
}