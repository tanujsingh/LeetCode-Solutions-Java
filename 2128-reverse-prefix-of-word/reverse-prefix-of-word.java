class Solution {
    public String reversePrefix(String word, char ch) {
        int i = 0;
        for (; i < word.length(); ++i) {
            if (ch == word.charAt(i)) {
                break;
            }
        }
        if (i == word.length()) {
            return word;
        }

        StringBuilder sb = new StringBuilder();

        while (i >= 0) {
            sb.append(word.charAt(i--));
        }

        int len = sb.length();

        while (len < word.length()) {
            sb.append(word.charAt(len++));
        }

        return sb.toString();
    }
}