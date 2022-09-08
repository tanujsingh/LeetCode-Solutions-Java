class Solution {
    public int change(int amount, int[] coins) {
       int[] dp = new int[amount + 1];
        dp[0] = 1;
        
        for(int coin : coins) {
            for(int i = 0; i <= amount; ++i) {
                if(i - coin >= 0)
                    dp[i] += dp[i - coin]; 
            }
        }
        
        return dp[amount];
    }
    
    /*-------------------------Brute Force ------------------------------------*/
    /*
    int count = 0;
    public int change(int amount, int[] coins) {
        if(amount == 0) {
            return 1;
        }
        return helper(amount, coins, 0);
    }
    
    private int helper(int remain, int[] coins, int start) {
        if(remain < 0) {
            return 0;
        }
        
        if(remain == 0) {
            return count++;
        }
        
        for(int i = start; i < coins.length; ++i) {
            if(remain - coins[i] >= 0) {
                helper(remain - coins[i], coins, i);
            }
        }
        
        return count;
    }
    */
}