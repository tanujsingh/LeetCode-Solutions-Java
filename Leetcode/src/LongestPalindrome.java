
public class LongestPalindrome {
	int start = 0;
	int end = 0;
	int maxLength = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestPalindrome lp = new LongestPalindrome();
		System.out.println(lp.longestPalindrome("cbbd"));
		System.out.println(lp.longestPalindrome("babad"));
		System.out.println(lp.longestPalindrome("abccbadab"));
		
	}
	
	public String longestPalindrome(String s) {
		
		if(s.length() < 2) return s;
		
		for(int i = 0; i < s.length(); ++i) {
			extendPalindrome(s, i, i);
			extendPalindrome(s, i, i+1);
		}
		
		return s.substring(start, start + maxLength);
	}
	
	public void extendPalindrome(String s, int left, int right) {
		while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		
		if(maxLength < right - left - 1) {
			start = left + 1;
			end = right - 1;
			maxLength = end - start + 1;
		}
		
	}

}
