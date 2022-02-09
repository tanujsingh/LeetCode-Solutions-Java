import java.util.*;
public class KDiffPairsInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KDiffPairsInAnArray obj = new KDiffPairsInAnArray();
		int[] nums = new int[] {1,2,3,4,5};
		int k = 1;
		System.out.println(obj.findPairs(nums, k));
	}
	
	public int findPairs(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		int count=0;
		for(int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
		for(int num : map.keySet()) {
			if(k > 0 && map.containsKey(num + k)) count++;
			if(k == 0 && map.get(num) > 1) count++;
		}
		
		return count;
		
	}

}
