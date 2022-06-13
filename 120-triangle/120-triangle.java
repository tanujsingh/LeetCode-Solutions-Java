class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();
        int n = triangle.get(m - 1).size();
        int[][] dp = new int[m][n];
        
        dp[0][0] = triangle.get(0).get(0);
        
        for(int i = 1; i < m; ++i) {
            List<Integer> curr = triangle.get(i);
            for(int j = 0; j < curr.size(); ++j) {
                if(j == 0) {
                    dp[i][j] = dp[i - 1][j] + curr.get(j);     
                } else if (j == curr.size() - 1){
                    dp[i][j] = dp[i - 1][j - 1] + curr.get(j);
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j - 1], dp[i - 1][j]) + curr.get(j);
                } 
            }
        }
       
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; ++i) {
            min = Math.min(dp[m - 1][i], min);
        }
        
        return min;
    }
}