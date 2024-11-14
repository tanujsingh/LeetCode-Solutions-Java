class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> chars = new HashMap<>();
        int left = 0;
        int maxLength = 0;
        for (int right = 0; right < s.length(); ++right) {
            char ch = s.charAt(right);
            chars.put(ch, chars.getOrDefault(ch, 0) + 1);
            while (chars.get(ch) > 1) {
                char c = s.charAt(left);
                chars.put(c, chars.get(c) - 1);
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}