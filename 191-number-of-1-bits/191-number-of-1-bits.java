public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ones = 0;
        int leastBit = 0;
        while(leastBit < 32) {
            if((n & 1) == 1) {
                ones++;
            }
            n = n >> 1;
            leastBit++;
        }
        return ones;
    }
}