import java.util.*;
public class SubArraySumEqualsK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubArraySumEqualsK obj = new SubArraySumEqualsK();
		int[] nums=new int[] {1,2,3};
		int k=3;
		System.out.println(obj.subarraySum(nums, k));
		
	}
	public int subarraySum(int[] nums,int k) {
		Map<Integer, Integer>map=new HashMap<>();
		int count=0,sum=0;
		map.put(0, 1);
		for(int num:nums) {
			sum+=num;
			if(map.containsKey(sum-k)) {
				count+=map.get(sum-k);
			}
			map.put(sum,map.getOrDefault(sum,0)+1);
		}
		return count;
	}

}
