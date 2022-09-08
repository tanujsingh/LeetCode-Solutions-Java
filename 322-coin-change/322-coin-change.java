class Solution {
    
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        
        dp[0] = 0;
        
        for(int i = 1; i <= amount; ++i) {
            for(int coin : coins) {
                if(i - coin >= 0)
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }
        
        return dp[amount] == amount + 1 ? -1 : dp[amount];
    }
    
    /*---------------------------------Memoization T: O(S * c) S: O(S) -----------------------------------*/
    /*
    private Integer[] memo;
    public int coinChange(int[] coins, int amount) {
        memo = new Integer[amount + 1];
        return helper(coins, amount);
    }
    
    private int helper(int[] coins, int amount) {
        if(amount < 0) return -1;
        if(amount == 0) return 0;
        
        if(memo[amount] != null) return memo[amount];
        
        int minCount = Integer.MAX_VALUE;
        
        for(int coin : coins) {
            int count = helper(coins, amount - coin);
            if(count == -1) continue;
            minCount = Math.min(minCount, count + 1);
        }
        
        memo[amount] = minCount == Integer.MAX_VALUE ? -1 : minCount;
        return memo[amount];
    }
    */
}