class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] chars = new char[26];
        
        for(char ch : magazine.toCharArray()) {
            chars[ch - 'a']++;
        }
        
        for(char c : ransomNote.toCharArray()) {
            if(chars[c - 'a'] <= 0) {
                return false;
            } else {
                chars[c - 'a']--;
            }
        }
        return true;
    }
}