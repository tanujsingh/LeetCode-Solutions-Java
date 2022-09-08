class Solution {
    List<List<Integer>> list = new ArrayList<>();;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        helper(candidates, target, new ArrayList<>(), 0);
        return list;
    }
    
    private void helper(int[] candidates, int remain, List<Integer> tempList, int start) {
        if(remain < 0) {
            return;
        }
        
        if(remain == 0) {
            list.add(new ArrayList<>(tempList));
            return;
        }
        
        for(int i = start; i < candidates.length; ++i) {
            if((i != start && candidates[i] == candidates[i - 1]) || candidates[i] > remain) {
                continue;
            }

            if(remain - candidates[i] >= 0) {
                tempList.add(candidates[i]);
                helper(candidates, remain - candidates[i], tempList, i + 1);
                tempList.remove(tempList.size() - 1);
            }
        }
        
        
    }
}