class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']'){
                if (stack.isEmpty() || map.get(stack.pop()) != ch) {
                    return false;
                }
            } 
        }
        
        if(!stack.isEmpty()) {
            return false;
        }
        return true;
    }
}