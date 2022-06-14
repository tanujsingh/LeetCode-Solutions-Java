class Solution {
    public int maxProfit(int[] prices) {
        int sold = Integer.MIN_VALUE, hold = Integer.MIN_VALUE;
        int coolDown = 0;
        
        for(int price : prices) {
            
            hold = Math.max(hold, coolDown - price);
            coolDown = Math.max(coolDown, sold);
            sold = hold + price;
        }
        
        return Math.max(sold, coolDown);
    }
}