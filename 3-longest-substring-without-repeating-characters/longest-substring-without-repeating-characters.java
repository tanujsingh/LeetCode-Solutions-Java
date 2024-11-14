class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] chars = new int[128];
        int left = 0;
        int maxLength = 0;
        for (int right = 0; right < s.length(); ++right) {
            char ch = s.charAt(right);
            chars[ch]++;
            while (chars[ch] > 1) {
                char c = s.charAt(left);
                chars[c]--;
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}