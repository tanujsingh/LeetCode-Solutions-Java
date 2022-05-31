class Solution {
    public String reverseWords(String s) {
        String[] strArr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        
        for(String str : strArr) {
            String revStr = reverse(str);
            sb.append(revStr + " ");
        }
        return sb.toString().trim();
    }
    
    private String reverse(String str) {
        char[] charArr = str.toCharArray();
        
        int left = 0;
        int right = charArr.length - 1;
        
        while (left < right) {
           char ch = charArr[left];
           charArr[left] = charArr[right];
           charArr[right] = ch;
            left++;
            right--;
        }
        
        return new String(charArr);
    }
}