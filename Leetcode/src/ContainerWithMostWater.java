
public class ContainerWithMostWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContainerWithMostWater c = new ContainerWithMostWater();
		int[] height = new int[] {1,8,6,2,5,4,8,3,7};
		System.out.println(c.maxArea(height));

	}
	
	public int maxArea(int[] height) {
		int max = 0;
		int left = 0, right = height.length - 1;
		while(left < right) {
			max = Math.max(max, Math.min(height[left], height[right])*(right - left));	
			if(height[left] < height[right]) left++;
			else right--;
		}
		return max;
	}

}
