
public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestCommonPrefix lcp = new LongestCommonPrefix();
		String[] strs = new String[] {"flower", "flow", "flight"};
		System.out.println(lcp.longestCommonPrefix(strs));
		//System.out.println(); - syso + ctrl + space
	}
	
	public String longestCommonPrefix(String[] strs) {
		if(strs.length == 0) return "";
		
		for(int i = 0; i < strs[0].length(); ++i) {
			char ch = strs[0].charAt(i);
			
			for(int j = 1; j < strs.length; ++j)
				if(i == strs[j].length() || ch != strs[j].charAt(i))
					return strs[0].substring(0,i);
		}
		return strs[0];
	}

}
