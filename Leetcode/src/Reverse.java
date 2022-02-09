import java.util.*;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse r = new Reverse();
		System.out.println(r.reverse(-123));
		System.out.println(r.reverse(123));
		
	}
	
	public int reverse(int x) {
		int res = 0;
		int sign = 1;
		if (x == 0) return x;
		
		while(x%10 == 0) x /= 10;
		
		sign = x < 0 ? -1 : 1;
		
		while(x != 0) {
			int digit = x%10;
			if(sign < 0 && res < (Integer.MIN_VALUE - digit)/10) return 0;
			if(sign > 0 && res > (Integer.MAX_VALUE - digit)/10) return 0;
			
			res = res *10 + digit;
			x = x/10;
			
		}
		
 		return res;
	}
	

}
