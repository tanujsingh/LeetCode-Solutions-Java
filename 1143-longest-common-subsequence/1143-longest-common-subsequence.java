class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[][] memo = new int[m + 1][n + 1];
        
        for(int i = 0; i < m; ++i) {
            for(int j = 0; j < n; ++j) {
                memo[i][j] = -1;
            }
        }
        
        return helper(0, 0, memo, text1, text2);
    }
    
    private int helper(int p1, int p2, int[][] memo, String text1, String text2) {
        if(memo[p1][p2] != -1) return memo[p1][p2];
        
        int ans = 0;
        if(text1.charAt(p1) == text2.charAt(p2)) {
            ans = 1 + helper(p1 + 1, p2 + 1, memo, text1, text2);
        } else {
            ans = Math.max(helper(p1 + 1, p2, memo, text1, text2), helper(p1, p2 + 1, memo, text1, text2));
        }
        
        memo[p1][p2] = ans;
        return ans;
    }
    
    /*----------------------T: O(M.N2) S: O(M.N)------------------------*/
    /*
        public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[][] memo = new int[m + 1][n + 1];
        
        for(int i = 0; i < m; ++i) {
            for(int j = 0; j < n; ++j) {
                memo[i][j] = -1;
            }
        }
        
        return helper(0, 0, memo, text1, text2);
    }
    
    private int helper(int p1, int p2, int[][] memo, String text1, String text2) {
        if(memo[p1][p2] != -1) return memo[p1][p2];
        
        int opt1 = helper(p1 + 1, p2, memo, text1, text2);
        int firstOccurance = text2.indexOf(text1.charAt(p1), p2);
        int opt2 = 0;
        if(firstOccurance != -1) {
            opt2 = 1 + helper(p1 + 1, firstOccurance + 1, memo, text1, text2);
        }
        
        memo[p1][p2] = Math.max(opt1, opt2);
        return memo[p1][p2];
    }
    */
}