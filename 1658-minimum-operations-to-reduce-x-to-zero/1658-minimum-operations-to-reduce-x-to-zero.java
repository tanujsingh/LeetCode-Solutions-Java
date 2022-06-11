class Solution {
    public int minOperations(int[] nums, int x) {
        int sumNums = 0, curs = 0;
        for (int n: nums) sumNums += n;
        Map<Integer, Integer> memo = new HashMap<>();
        memo.put(0,-1);
        if (sumNums == x) return nums.length;
        int target = sumNums - x, maxWindowSize = 0;
        for (int i = 0; i<nums.length; i++){
            curs += nums[i];
            memo.put(curs,i);
            if (memo.containsKey(curs - target))
                maxWindowSize = Math.max(maxWindowSize, i-memo.get(curs - target));
        }
        
        return maxWindowSize>0?(nums.length-maxWindowSize):-1;
    }
}