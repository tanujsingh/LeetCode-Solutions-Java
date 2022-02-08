
import java.util.*;
public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target = 9;
		int[] nums = new int[]{2,7,11,15};
		
		System.out.println(Arrays.toString(twoSum(nums, target)));
	}
	
	public static int[] twoSum(int[] nums, int target) {
		int[] res = new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < nums.length; ++i) {
			if(map.containsKey(nums[i])) {
				res[0] = i;
				res[1] = map.getOrDefault(nums[i], i);
			} else {
				map.put(target - nums[i],i);
			}
		}
		return res;
	}

}
