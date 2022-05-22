class Solution {
    public int countSubstrings(String s) {
        int ans = 0;
        
        for (int start = 0; start < s.length(); ++start) {
            for(int end = start; end < s.length(); ++end) {
                ans += isPalindrome(s, start, end) ? 1 : 0;
            }
        }
        return ans;
    }
    
    private boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}