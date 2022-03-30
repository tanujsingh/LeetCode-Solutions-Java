public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int reverse = 0;
        int power = 31;
        for (int i = 0; i < 32; ++i) {
            reverse += (n & 1) << power;
            n >>= 1;
            power--;
        }
        return reverse;
    }
}