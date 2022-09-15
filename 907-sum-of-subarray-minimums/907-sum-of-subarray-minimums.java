public class Pair {
    int num;
    int count;
    
    Pair(int num, int count) {
        this.num = num;
        this.count = count;
    }
}

class Solution {
    public int sumSubarrayMins(int[] arr) {
        
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        
        ArrayDeque<Pair> stackLeft = new ArrayDeque<>();
        ArrayDeque<Pair> stackRight = new ArrayDeque<>();
        
        int mod = 1000000007;
        
        for(int i = 0; i < arr.length; ++i) {
            int curr = arr[i];
            int count = 1;
            while(!stackLeft.isEmpty() && stackLeft.peek().num > curr) {
                count += stackLeft.peek().count;
                stackLeft.pop();
            }
            stackLeft.push(new Pair(curr, count));
            left[i] = count;
        }
        
        for(int i =  arr.length - 1; i >= 0; --i) {
            int curr = arr[i];
            int count = 1;
            while(!stackRight.isEmpty() && stackRight.peek().num >= curr) {
                count += stackRight.peek().count;
                stackRight.pop();
            }
            stackRight.push(new Pair(curr, count));
            right[i] = count;
        }
        
        long sum = 0;
        for(int i = 0; i < arr.length; ++i) {
            sum = (sum + (long)arr[i]*left[i]*right[i])%mod;
        }
        
        return (int)sum;
    }
}