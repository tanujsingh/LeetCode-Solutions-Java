class Solution {
    List<List<Integer>> answer = new ArrayList<>();
    
    public List<List<Integer>> permute(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        helper(new ArrayList<>(), nums, visited);
        return answer;
    }
    
    private void helper(List<Integer> list, int[] nums, boolean[] visited) {
        if(list.size() == nums.length) {
            answer.add(new ArrayList<>(list));
            return;
        }
        
        for(int i = 0; i < nums.length; ++i) {
            if(!visited[i]) {
                visited[i] = true;
                list.add(nums[i]);
                helper(list, nums, visited);
                visited[i] = false;
                list.remove(list.size() - 1);
            }
        }
    } 
}