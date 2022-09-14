class Solution {
    public int minSwaps(int[] data) {
        int slidingWindowRange = 0;
        
        for(int item : data) {
            slidingWindowRange += item;
        }
        
        int left = 0;
        int right = 0;
        int maxOnesInRange = 0;
        int currOnesInRange = 0;
        
        for(int i = 0; i < slidingWindowRange; ++i) {
            currOnesInRange += data[i];
            maxOnesInRange = Math.max(maxOnesInRange, currOnesInRange);
            right++;
        }
        
        while(right != data.length) {
            currOnesInRange += data[right++];
            currOnesInRange -= data[left++];
            maxOnesInRange = Math.max(maxOnesInRange, currOnesInRange);
        }
        
        return slidingWindowRange - maxOnesInRange;
    }
}