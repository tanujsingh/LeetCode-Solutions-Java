class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if (n > m) return false;
        
        int[] chars1 = new int[26];
        int[] chars2 = new int[26];

        for (int i = 0; i < n; ++i) {
            chars1[s1.charAt(i) - 'a']++;
            chars2[s2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < m - n; ++i) {
            if (permute(chars1, chars2)) {
                return true;
            }
            chars2[s2.charAt(i + n) - 'a']++;
            chars2[s2.charAt(i) - 'a']--;
        }
        return permute(chars1, chars2);
    }

    public boolean permute(int[] chars1, int[] chars2) {
        for (int i = 0; i < 26; ++i) {
            if (chars1[i] != chars2[i]) {
                return false;
            }
        }
        return true;
    }
}