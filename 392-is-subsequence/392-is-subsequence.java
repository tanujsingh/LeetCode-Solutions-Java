class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() > t.length()) return false;
        if(s.length() == 0) return true;
        int pos = 0;
        for(char ch : t.toCharArray()){
            if(ch != s.charAt(pos)) continue;
            else {
                pos++;
            }
            
            if(pos == s.length()) return true;
        }
        
        return false;
    }
}