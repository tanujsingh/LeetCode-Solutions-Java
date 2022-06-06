class Solution {
    List<String> answer = new ArrayList<>();
    public List<String> letterCasePermutation(String s) {
        helper(s.toCharArray(), 0);
        return answer;
    }
    
    private void helper(char[] s, int pos) {
        if(s.length == pos) {
            answer.add(new String(s));
        } else {
            if(Character.isLetter(s[pos])) {
                s[pos] = Character.toLowerCase(s[pos]);
                helper(s, pos + 1);
                s[pos] = Character.toUpperCase(s[pos]);
            }
            helper(s, pos + 1);
        }     
        
    
    }
}