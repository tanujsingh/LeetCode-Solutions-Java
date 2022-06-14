class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int memo[][] = new int[m+1][n+1];
        
        return m + n - 2 * longestCommonSubSequence(word1, word2, m, n, memo);
        
    }
    
    private int longestCommonSubSequence(String s1, String s2, int m, int n, int[][] memo) {
        if(m == 0 || n == 0) {
            return 0;
        }
        
        if(memo[m][n] > 0) {
            return memo[m][n];
        }
        
        if(s1.charAt(m - 1) == s2.charAt(n - 1)) {
            memo[m][n] = 1 + longestCommonSubSequence(s1, s2, m - 1, n - 1, memo);
        } else {
            memo[m][n] = Math.max(longestCommonSubSequence(s1, s2, m - 1, n, memo), longestCommonSubSequence(s1, s2, m, n - 1, memo));
        }
        return memo[m][n];
    }
}