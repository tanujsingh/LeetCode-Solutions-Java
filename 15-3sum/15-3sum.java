class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            map.put(-nums[i], i);
        }
        
        for(int i = 0; i < nums.length; ++i) {
            for(int j = i + 1; j < nums.length; ++j) {
                int key = nums[i] + nums[j];
                if(map.containsKey(key)) {
                    int k = map.get(key);
                    
                    if(k != i && k != j) {
                        List<Integer> tuple = Arrays.asList(nums[i], nums[j], nums[k]); 
                        Collections.sort(tuple);
                        set.add(tuple);
                    }
                }
            }
        }
        
        return new ArrayList(set);
    }
}