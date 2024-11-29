class Solution {
    public boolean closeStrings(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        
        if (n != m) return false;
        if (word1.equals(word2)) return true;
        
        int[] word1Chars = new int[26];
        int[] word2Chars = new int[26];
        int[] freq = new int[n + 1];

        for (char ch : word1.toCharArray()) {
            word1Chars[ch - 'a']++;
        }

        for (char ch : word2.toCharArray()) {
            word2Chars[ch - 'a']++;
        }

        for (int i = 0; i < 26; ++i) {
            if ((word1Chars[i] == 0 && word2Chars[i] != 0 ) || 
            (word1Chars[i] != 0 && word2Chars[i] == 0)) 
            return false;
            freq[word1Chars[i]]++;
            freq[word2Chars[i]]--;
        }

        for (int x : freq) {
            if (x != 0) return false;
        }


        return true;
    }
}