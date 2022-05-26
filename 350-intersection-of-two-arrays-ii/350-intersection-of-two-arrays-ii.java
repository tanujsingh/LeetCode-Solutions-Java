class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length < nums2.length) {
            return intersect(nums2, nums1);
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int i = 0, j = 0, k = 0;
        
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                nums2[k++] = nums2[j++];
                i++;
            }
        }
        return Arrays.copyOf(nums2, k);
    }
}