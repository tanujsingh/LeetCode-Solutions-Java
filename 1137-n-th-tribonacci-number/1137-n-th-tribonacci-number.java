class Solution {
    public int tribonacci(int n) {
        if (n == 0 || n == 1){
            return n;
        }
        
        int lastThree = 0;
        int lastTwo = 1;
        int lastOne = 1;
        int present = 1;
        
        for(int i = 3; i <= n; ++i) {
            present = lastOne + lastTwo + lastThree;
            lastThree = lastTwo;
            lastTwo = lastOne;
            lastOne = present;
        }
        return present;
    }
}