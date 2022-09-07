class Solution {
    List<List<Integer>> list = new ArrayList<>();   
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        helper(candidates, target, new ArrayList<>(), 0);
        return list;
    }
    
    private void helper(int[] candidates, int remain, List<Integer> combList, int start) {
        
        if(remain == 0) {
            list.add(new ArrayList<>(combList));
            return;
        }
        
        if(remain < 0) {
            return;
        }
        
        for(int i = start; i < candidates.length; ++i) {
            if(remain - candidates[i] >= 0) {
                combList.add(candidates[i]);
                helper(candidates, remain - candidates[i], combList, i);
                combList.remove(combList.size() - 1);
            }
        }
        
    }
}