class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> count = new HashMap<>();
        List<List<Integer>> ans = Arrays.asList(new ArrayList<>(), new ArrayList<>());
        for (int[] match : matches) {
            int winner = match[0];
            int loser = match[1];
            count.put(winner, count.getOrDefault(winner, 0));
            count.put(loser, count.getOrDefault(loser, 0) + 1);
        }
        
        for (int player : count.keySet()) {
            if (count.get(player) == 0) {
                ans.get(0).add(player);
            }
            if (count.get(player) == 1) {
                ans.get(1).add(player);
            }
        }
        
        ans.forEach(list -> Collections.sort(list));
        
        return ans;
    }
}