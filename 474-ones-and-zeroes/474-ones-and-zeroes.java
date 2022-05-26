class Solution {
    private int[][][] memo;
    public int findMaxForm(String[] strs, int m, int n) {
		memo = new int[strs.length][m + 1][n + 1];
        return helper(0, m, n, strs);
	}

	private int helper(int index, int m, int n, String[] strs) {
        
		if (index == strs.length) return 0;
		if (memo[index][m][n] > 0) return memo[index][m][n];
		
		int zero = countZeros(strs[index]);
		int one = strs[index].length() - zero;
		
		int res = helper(index + 1, m, n, strs);
		if (m >= zero && n >= one)
			res = Math.max(res, 1 + helper(index + 1, m - zero, n - one, strs));
		
		return memo[index][m][n] = res;
	}

	private int countZeros(String s) {
		int res = 0;
		for (char c : s.toCharArray()) {
			if (c == '0') res++;
		}
		return res;
	}
}