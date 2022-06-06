class Solution {
    List<List<Integer>> answer = new LinkedList<>();
    public List<List<Integer>> combine(int n, int k) {
        helper(new LinkedList<>(), n, k, 1);
        return answer;
    }
    private void helper(List<Integer> list, int n, int k, int begin) {
        if(list.size() == k) {
            answer.add(new LinkedList<>(list));
            return;
        }
        
        for(int i = begin; i <= n; ++i) {
            list.add(i);
            helper(list, n, k, i + 1);
            list.remove(list.size() - 1);
        }
    }
}