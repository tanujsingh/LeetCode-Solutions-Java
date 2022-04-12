class Solution {
    public int firstUniqChar(String s) {
        char[] chars = new char[26];
        for(char ch : s.toCharArray()) {
            chars[ch - 'a']++;
        }
        for(int i = 0; i < s.length(); ++i) {
            if(chars[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}