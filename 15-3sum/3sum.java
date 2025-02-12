class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        for(int curr = 0; curr < n - 2; ++curr) {
            if (curr > 0 && nums[curr- 1] == nums[curr]) continue;
            int left = curr + 1;
            int right = n - 1;

            while (left < right) {
                int localSum = nums[curr] + nums[left] + nums[right];
                if (localSum == 0) {
                    res.add(Arrays.asList(nums[curr], nums[left++], nums[right--]));
                    while(left < right && nums[left] == nums[left - 1]) left++;
                    while(right < right && nums[right] == nums[right + 1]) right--;
                } else if (localSum > 0) right--;
                else left++;
            }
        }
        
        return res;
    }
}