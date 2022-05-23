class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pos = m + n - 1;
        
        while (m > 0 && n > 0) {
            if (nums1[m - 1] > nums2[n - 1]) {
                nums1[pos--] = nums1[m - 1];
                m--;
            } else {
                nums1[pos--] = nums2[n - 1];
                n--;
            }
        }
        
        while (m > 0) {
            nums1[pos--] = nums1[m - 1];
            m--;
        }
        
        while (n > 0) {
            nums1[pos--] = nums2[n - 1];
            n--;
        }
        
    }
}