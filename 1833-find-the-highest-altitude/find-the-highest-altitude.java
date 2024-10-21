class Solution {
    public int largestAltitude(int[] gain) {
        int prefixSum = 0;
        int maxAlt = 0;

        for (int i = 0; i < gain.length; ++i) {
            prefixSum += gain[i];
            if (maxAlt < prefixSum) {
                maxAlt = prefixSum;
            }
        }
        return maxAlt;
    }
}