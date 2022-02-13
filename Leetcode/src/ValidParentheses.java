
import java.util.Map;
import java.util.HashMap;
import java.util.Stack;
public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidParentheses vp = new ValidParentheses();
		System.out.println(vp.isValid("()"));
		
	}
	
	public boolean isValid(String s) {
		Map<Character, Character> map = new HashMap<>();
		Stack<Character> stack = new Stack<>();
		map.put('{','}');
		map.put('[',']');
		map.put('(',')');
		
		for(char ch : s.toCharArray()) {
			if(ch == '(' || ch == '[' || ch == '{') {
				stack.push(ch);
				}
			else if(ch == '}' || ch == ']' || ch == ')')
					if (stack.isEmpty() || ch != map.get(stack.pop())) 
						return false;
		}
		
		if(!stack.isEmpty()) return false;
		
		return true;
		
	}

}
