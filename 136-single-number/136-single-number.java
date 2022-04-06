class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet();
        int sumNum = 0;
        int sumArr = 0;
        
        for(int num : nums) {
            set.add(num);
            sumArr += num;
        }
        
        for(int num : set) {
            sumNum += num;
        }
        
        return 2*sumNum - sumArr;
    }
}