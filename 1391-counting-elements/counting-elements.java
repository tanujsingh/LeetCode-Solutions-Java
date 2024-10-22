class Solution {
    public int countElements(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int ans = 0;
        for (int num : arr) {
            set.add(num);
        }
        
        for (int i = 0; i < arr.length; ++i) {
            if (set.contains(arr[i] + 1)) {
                ans++;
            }
        }
        
        return ans;
    }
}