class Solution {
    public boolean reorderedPowerOf2(int n) {
        int[] count = countDigits(n);
        
        for(int i = 0; i < 32; ++i) {
            if(Arrays.equals(count, countDigits(1 << i))) return true;
        }
        
        return false;
    }
    
    private int[] countDigits(int n) {
        int[] res = new int[10];
        
        while(n > 0) {
            res[n%10]++;
            n /= 10;
        }
        
        return res;
    }
}