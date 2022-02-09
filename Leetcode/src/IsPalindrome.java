
public class IsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsPalindrome ip = new IsPalindrome();
		System.out.println(ip.isPalindrome(12121));
	}
	
	public boolean isPalindrome(int x) {
		if(x < 0) return false;
		String s = String.valueOf(x);
		int left = 0, right = s.length() - 1;
		while(left <= right) {
			if(s.charAt(left++) != s.charAt(right--)) return false;
		}
		
		return true;
	}

}
