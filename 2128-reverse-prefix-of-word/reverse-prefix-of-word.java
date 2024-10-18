class Solution {
    public String reversePrefix(String word, char ch) {
        int left = 0;
        char[] res = word.toCharArray();

        for (int right = 0; right < word.length(); ++right) {
            if (res[right] == ch) {
                while (left < right) {
                    char temp = res[left];
                    res[left] = res[right];
                    res[right] = temp;
                    right--;
                    left++;
                }
                return new String(res);
            }
        }
        return word;
    }
}