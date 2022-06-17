class Solution {
    int longestSubString = 0;
    int start = 0;
    int end = 0;
    public String longestPalindrome(String s) {
        if(s.length() < 2) {
            return s;
        }
        for(int i = 0; i < s.length(); ++i) {
            extendPalindrome(s, i, i);
            extendPalindrome(s, i, i + 1);
        }
        
        return s.substring(start, start + longestSubString);
    }
    
    private void extendPalindrome(String s, int left, int right) {
        while(left >= 0 && right < s.length()) {
            if(s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            } else {
                break;
            }
        }
        
        if(longestSubString < right - left - 1) {
            start = left + 1;
            end = right - 1;
            longestSubString = end - start + 1;
        }
    }
}