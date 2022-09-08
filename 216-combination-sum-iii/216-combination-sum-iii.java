class Solution {
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        helper(k, n, new ArrayList<>(), 1);
        return list;
    }
    
    private void helper(int k, int n, List<Integer> tempList, int start) {
        if(tempList.size() == k && n == 0) {
            list.add(new ArrayList<>(tempList));
            return;
        }
        
        if(tempList.size() > k) {
            return;
        }
        
        for(int i = start; i <= 9; ++i) {
            if(n - i >= 0) {
                tempList.add(i);
                helper(k, n - i, tempList, i + 1);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}