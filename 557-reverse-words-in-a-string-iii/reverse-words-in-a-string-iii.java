class Solution {
    public String reverseWords(String s) {
        char[] stringArr = s.toCharArray();
        int left = 0;
        int right = 0;

        for (int i = 0; i < stringArr.length; ++i) {
            if (stringArr[i] == ' ') {
                right = i - 1;
                reverse(stringArr, left, right);
                left = i + 1;    
            }
            
        }

        reverse(stringArr, left, stringArr.length - 1);

        return new String(stringArr);
    }

    private void reverse(char[] stringArr, int left, int right) {
        while (left < right) {
            char temp = stringArr[left];
            stringArr[left] = stringArr[right];
            stringArr[right] = temp;
            left++;
            right--;
        }
    }
}