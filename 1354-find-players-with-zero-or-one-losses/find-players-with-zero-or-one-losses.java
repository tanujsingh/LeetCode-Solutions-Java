class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        int[] lossCount = new int[100001];
        Arrays.fill(lossCount, -1);
        List<List<Integer>> ans = Arrays.asList(new ArrayList<>(), new ArrayList<>());

        for (int[] match : matches) {
            int winner = match[0];
            int loser = match[1];

            if (lossCount[winner] == -1) {
                lossCount[winner] = 0;
            } 
            
            if (lossCount[loser] == -1) {
                lossCount[loser] = 1;
            } else {
                lossCount[loser]++;
            }
        } 

        for (int i = 0; i < 100001; ++i) {
            if (lossCount[i] == 0) {
                ans.get(0).add(i);
            } else if (lossCount[i] == 1) {
                ans.get(1).add(i);
            } 
        }

        return ans;
    }
}