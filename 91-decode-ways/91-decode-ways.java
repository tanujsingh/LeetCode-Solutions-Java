class Solution {
    Map<Integer, Integer> memo = new HashMap<>();
    
    public int numDecodings(String s) {
        return helper(0, s);    
    }
    
    private int helper(int i, String s) {
        if(memo.containsKey(i)) {
            return memo.get(i);
        }
        
        if(i == s.length()) {
            return 1;
        }
        
        if(s.charAt(i) == '0'){
            return 0;
        }
        
        if(i == s.length() - 1) {
            return 1;
        }
        
        int ans = helper(i + 1, s);
        int twoDigit = Integer.parseInt(s.substring(i, i + 2));
        if( twoDigit >= 10 && twoDigit <= 26) {
            ans += helper(i + 2, s);
        }
        memo.put(i, ans);
        
        return ans;
    }
}