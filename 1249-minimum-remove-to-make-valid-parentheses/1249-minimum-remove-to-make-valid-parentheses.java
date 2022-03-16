class Solution {
    public String minRemoveToMakeValid(String s) {
        Set<Integer> set = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else if (s.charAt(i) == ')') {
                if(stack.isEmpty()) {
                    set.add(i);
                } else {
                    stack.pop();
                }
            }
        }
        while (!stack.isEmpty()) {
            set.add(stack.pop());
        }
        for (int i = 0; i < s.length(); ++i) {
            if(!set.contains(i)) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}