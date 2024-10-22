class Solution {
    public boolean checkIfPangram(String sentence) {
         int[] letters = new int[26];
        
        for (char ch : sentence.toCharArray()) {
            letters[ch - 'a']++;
        }
        
        for (int i = 0; i < 26; ++i) {
            if (letters[i] == 0) return false;
        }
        return true;
    }
}