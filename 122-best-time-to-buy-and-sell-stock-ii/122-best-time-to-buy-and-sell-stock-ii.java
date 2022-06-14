class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length < 2) {
            return 0;
        }
        
        int n = prices.length;
        int buy = -prices[0];
        int sell = 0;

        for(int i = 1; i < n; ++i) {
            buy = Math.max(buy, sell - prices[i]);
            sell = Math.max(sell, buy + prices[i]);
        }
        
        return sell;
    }
}