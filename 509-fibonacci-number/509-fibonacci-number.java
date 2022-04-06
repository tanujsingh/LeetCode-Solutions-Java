class Solution {
    public int fib(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        int lastOne = 1;
        int lastTwo = 0;
        int present = 0;
        for (int i = 2; i <=n; ++i) {
            present = lastOne + lastTwo;
            lastTwo = lastOne;
            lastOne = present;
        }
        return present;
    }
}