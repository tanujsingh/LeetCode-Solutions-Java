class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        
        if( m > n) {
            return findMedianSortedArrays(nums2, nums1);
        }
        
        int low = 0;
        int high = m;
        
        while (low <= high) {
            int partitionM = (low + high) / 2;
            int partitionN = (m + n + 1)/2 - partitionM;
            
            int maxLeftM = partitionM == 0 ? Integer.MIN_VALUE : nums1[partitionM - 1];
            int maxLeftN = partitionN == 0 ? Integer.MIN_VALUE : nums2[partitionN - 1];
            int minRightM = partitionM == m ? Integer.MAX_VALUE : nums1[partitionM];
            int minRightN = partitionN == n ? Integer.MAX_VALUE : nums2[partitionN];
            
            if(maxLeftM <= minRightN && maxLeftN <= minRightM) {
                if((m + n)%2 == 0) {
                    return (double)(Math.max(maxLeftM, maxLeftN) + Math.min(minRightM, minRightN)) / 2;
                } else {
                    return (double)Math.max(maxLeftM, maxLeftN);
                }
            } else if(maxLeftM > minRightN) {
                high = partitionM - 1;
            } else {
                low = partitionM + 1;
            }
        }
        return 0.0;
    }
}