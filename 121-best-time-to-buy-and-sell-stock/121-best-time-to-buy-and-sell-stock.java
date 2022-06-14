class Solution {
    public int maxProfit(int[] prices) {
        int minVal = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for (int price : prices) {
            if(minVal > price) {
                minVal = price;    
            }
            maxProfit = Math.max(maxProfit, price - minVal);
        }
        
        return maxProfit;
    }
}