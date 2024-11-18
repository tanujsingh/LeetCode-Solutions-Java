class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];
        int maxFreq = 0;
        int ans = 0;
        for (int num : nums) {
            freq[num]++;

            if (maxFreq < freq[num]) {
                maxFreq = freq[num];
            }
        }

        for (int i = 0; i < 101; ++i) {
            if (freq[i] == maxFreq) {
                ans = ans + maxFreq;
            }
        }
        return ans;
    }
}