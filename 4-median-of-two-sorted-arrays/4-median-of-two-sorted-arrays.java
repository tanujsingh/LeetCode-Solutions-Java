class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double ans = 0.0;
        int m = nums1.length;
        int n = nums2.length;
        
        int[] resArr = new int[m + n];
        
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < m && j < n) {
            if(nums1[i] < nums2[j]) {
                resArr[k++] = nums1[i++];
            } else {
                resArr[k++] = nums2[j++];
            }
        }
        
        while(j < n) {
            resArr[k++] = nums2[j++];
        }
        
        while(i < m) {
            resArr[k++] = nums1[i++];
        }
        
        if(k % 2 == 0) {
            return (double)(resArr[k/2] + resArr[k/2 - 1])/2;
        } 
        
        return (double)resArr[k/2];
    }
}