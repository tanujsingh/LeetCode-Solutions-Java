class Solution {
    public int divide(int dividend, int divisor) {
        long quotient = 0;
        boolean negative = false;
        long dividendLong = (long) dividend;
        long divisorLong = (long) divisor;
        
        if (dividendLong == Integer.MIN_VALUE && divisorLong == -1) {
            return Integer.MAX_VALUE;
        }
        if (dividendLong < 0) {
            negative = !negative;
            dividendLong = -dividendLong;
        }
        
        if (divisorLong < 0) {
            negative = !negative;
            divisorLong = -divisorLong;
        }
        
        while (dividendLong - divisorLong >= 0) {
            long temp = divisorLong;
            long count = 1;
            while (temp <= dividendLong) {
                temp = temp << 1;
                count = count << 1;
            }
            quotient += count >> 1;
            dividendLong -= temp >> 1;
        }
        
        if (negative) {
            quotient = -quotient;
        }
        
        return (int)quotient;
    }
}