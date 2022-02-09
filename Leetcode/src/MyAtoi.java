import java.util.*;

public class MyAtoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyAtoi ma = new MyAtoi();
		System.out.println(ma.myAtoi("  -0032&123  "));
	}
	
	public int myAtoi(String s) {
		if(s.length() == 0) return 0;
		int sign = 1;
		int res = 0;
		char[] chars = s.toCharArray();
		int i = 0;
		while(chars[i] == ' ') i++;
		sign = chars[i] == '-' ? -1 : 1;
		if(chars[i] == '-' || chars[i] == '+') i++;
		
		while(i < s.length()) {
			if(!Character.isDigit(chars[i])) break;
			
			int digit = sign*(chars[i] - '0');
			
			
			if(sign < 0 && res < (Integer.MIN_VALUE - digit)/10) return Integer.MIN_VALUE;
			if(sign > 0 && res > (Integer.MAX_VALUE - digit)/10) return Integer.MAX_VALUE;
			
			res = res*10 + digit;
			i++;
		}
		
		
		return res;
	}

}
