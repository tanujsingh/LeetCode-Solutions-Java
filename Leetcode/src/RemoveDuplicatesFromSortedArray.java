
public class RemoveDuplicatesFromSortedArray {
	public int removeDuplicates(int[] nums) {
		int pos = 0;
		nums[pos++] = nums[0];
		
		for(int i = 1; i < nums.length; ++i) {
			if(nums[i] != nums[i-1])
				nums[pos++] = nums[i];
		}
		return pos;
	}
}
