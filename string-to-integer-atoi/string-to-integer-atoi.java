class Solution {
    public int myAtoi(String s) {
        if(s == null || s.length() == 0) return 0;
        int i = 0;
        int sign = 1;
        int sum = 0;
        while(s.charAt(i) == ' ') {
            i++; 
            if(i == s.length()) {
                return 0;
            }
        }
        sign = s.charAt(i) == '-' ? -1 : 1;
        if(s.charAt(i) == '-' || s.charAt(i) == '+') {
            i++;
        }
        
        while(i < s.length()) {
            char ch = s.charAt(i++);
            if(!Character.isDigit(ch)) {
                break;
            }
            
            int digit = sign * (ch - '0');
            
            if(sign > 0 && sum > (Integer.MAX_VALUE - digit)/10) return Integer.MAX_VALUE;
            if(sign < 0 && sum < (Integer.MIN_VALUE - digit)/10) return Integer.MIN_VALUE;
            
            sum = sum*10 + digit;
        }
        
        return sum;
    }
}