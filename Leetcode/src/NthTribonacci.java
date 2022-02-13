
public class NthTribonacci {
	public int tribonacci(int n) {
		if(n < 2) return n;
		if(n == 2) return 1;
		
		int current = 0;
		int prev1 = 1;
		int prev2 = 1;
		int prev3 = 0;
		
		for(int i = 3; i <= n; i++) {
			current = prev1 + prev2 + prev3;
			prev3 = prev2;
			prev2 = prev1;
			prev1 = current;
		}
		
		return current;
		
	}

}
