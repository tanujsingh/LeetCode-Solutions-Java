
import java.util.*;

public class LengthOfLongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
		System.out.println(lengthOfLongestSubstring("bbbbbb"));
		System.out.println(lengthOfLongestSubstring("pwwkew"));

	}
	
	public static int lengthOfLongestSubstring(String s) {
		Set<Character> set = new HashSet<>();
		int left = 0, right = 0, longestMatch = 0;
		
		while(right < s.length()) {
			if(!set.contains(s.charAt(right))) {
				set.add(s.charAt(right++));
				longestMatch = Math.max(longestMatch, right - left);
			} else {
				set.remove(s.charAt(left++));
			}
		}
		return longestMatch;
	}

}
