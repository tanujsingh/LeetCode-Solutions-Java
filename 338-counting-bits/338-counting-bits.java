class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        
        for(int i = 0 ; i <= n; ++i){
            int ones = 0;
            int temp = i;
            while (temp != 0){
                ones += temp%2;
                temp /= 2;
            }
            
            res[i] = ones;
        }
        
        return res;
    }
}