class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        
        for(int num : nums) {
            int idx = Math.abs(num);
            nums[idx - 1] *= -1;
            if(nums[idx - 1] > 0)
                list.add(idx);
        }
        
        return list;
    }
}