class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0 || needle == null) {
            return 0;
        }
        
        for (int i = 0; i < haystack.length(); ++i) {
            if (i + needle.length() > haystack.length()) {
                break;
            }
            
            char ch = haystack.charAt(i);
            if(ch == needle.charAt(0)) {
               String check = haystack.substring(i, i + needle.length());
               if(needle.equals(check)) {
                   return i;
               } 
            }
        }
        return -1;
    }
}