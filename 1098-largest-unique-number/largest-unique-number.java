class Solution {
    public int largestUniqueNumber(int[] nums) {
        int[] arr = new int[2001];
        Arrays.fill(arr, -1);
        
        for (int num : nums) {
            if (arr[num] == -1) {
                arr[num] = 0;
            } else {
                arr[num]++;
            }
        }
        
        for (int i= 2000; i >= 0; --i) {
            if (arr[i] == 0) {
                return i;
            }
        }
        return -1;
    }
}