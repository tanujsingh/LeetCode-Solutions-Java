class Solution {
    int count = 0;
    public int countSubstrings(String s) {
        for (int i = 0; i < s.length(); ++i) { // i is the mid point
            extendPalindrome(s, i, i); // odd length
            extendPalindrome(s, i, i + 1); //even length
        }
        return count;
    }
    private void extendPalindrome(String s, int left, int right) {
        while (left >= 0 && right < s.length()) {
            if (s.charAt(left) != s.charAt(right)) {
                return;   
            }
            count++;
            left--;
            right++;    
        }
    }
}