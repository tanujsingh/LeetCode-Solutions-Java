class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] chars = new int[128];
        int left = 0;
        int right = 0;
        int answer = 0;
        
        while(right < s.length()) {
            char ch = s.charAt(right++);
            chars[ch]++;
            
            while(chars[ch] > 1) {
                char c = s.charAt(left++);
                chars[c]--;
            }
            
            answer = Math.max(answer, right - left);
        }
        return answer;
    }
}