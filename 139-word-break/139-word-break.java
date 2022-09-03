class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        if(s == null || wordDict.size() == 0) return true;
        
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j <= i; ++j) {
                String sub = s.substring(j, i + 1);
                if(dp[j] && wordDict.contains(sub)) {
                    dp[i + 1] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
}