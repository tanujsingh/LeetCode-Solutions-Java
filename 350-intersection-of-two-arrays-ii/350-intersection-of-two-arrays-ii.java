class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        int i = 0;
        for (int num : nums2) {
            if(map.getOrDefault(num, 0) > 0) {
                nums2[i++] = num;
                map.put(num, map.get(num) - 1);
            }
        }
        
        return Arrays.copyOf(nums2, i);
    }
}