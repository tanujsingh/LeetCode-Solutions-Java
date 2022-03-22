/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        // int firstBad = Integer.MAX_VALUE;
        while(low < high) {
            int mid = low + (high - low)/2;
            if(isBadVersion(mid)) {
                // firstBad = Math.min(firstBad, mid);
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}