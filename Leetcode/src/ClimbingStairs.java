
public class ClimbingStairs {
	public int climbStairs(int n) {
		
		if(n < 3) return n;
		
		int numberOfWaysTop = 0;
		int numberOfWaysPreviousStep = 2;
		int numberofWaysPreviousTwoStep = 1;
		
		for(int i = 3; i <= n; ++i) {
			numberOfWaysTop = numberOfWaysPreviousStep + numberofWaysPreviousTwoStep;
			numberofWaysPreviousTwoStep = numberOfWaysPreviousStep;
			numberOfWaysPreviousStep = numberOfWaysTop;
		}
		
		return numberOfWaysTop;
	}
}
