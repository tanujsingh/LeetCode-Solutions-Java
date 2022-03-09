/*
Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer so that it remains in the range. Specifically, integers less than -231 should be clamped to -231, and integers greater than 231 - 1 should be clamped to 231 - 1.
Return the integer as the final result.

*/
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