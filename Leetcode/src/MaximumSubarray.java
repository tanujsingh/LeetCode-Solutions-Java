
public class MaximumSubarray {
	public int maxSubArray(int[] nums) {
		int max = Integer.MIN_VALUE;
		int localSum = 0;
		
		for(int num : nums) {
			localSum = Math.max(num, num + localSum);
			max = Math.max(max,  localSum);
		}
		
		return max;
	}
}
