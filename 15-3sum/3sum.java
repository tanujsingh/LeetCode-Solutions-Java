class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);

        for(int i = 0; i < nums.length && nums[i] <= 0; ++i) {
            if(i == 0 || nums[i - 1] != nums[i]) {
                findTwoSums(nums, i);
            }
        }

        return res;
    }

    public void findTwoSums(int[] nums, int i) {
        Set<Integer> set = new HashSet<>();
        for (int j = i + 1; j < nums.length; ++j) {
            int complement = - (nums[i] + nums[j]);
            if (set.contains(complement)) {
               res.add(Arrays.asList(nums[i], nums[j], complement));
               while(j < nums.length - 1 && nums[j] == nums[j + 1]) j++;
            }
            set.add(nums[j]);
        }
    }
}