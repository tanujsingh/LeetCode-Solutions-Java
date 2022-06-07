class Solution {
    public boolean isPowerOfTwo(int n) {
        long x = (long) n;
        if(x == 0) {
            return false;
        }
        
        return (x & -x) == x;
    }
}