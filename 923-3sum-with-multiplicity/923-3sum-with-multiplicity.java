class Solution {
    public int threeSumMulti(int[] arr, int target) {
        int result = 0;
        int mod = 1000000007;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; ++i) {
            result = (result + map.getOrDefault(target - arr[i], 0))%mod;
            for(int j = 0; j < i; ++j) {
                map.put(arr[i] + arr[j], map.getOrDefault(arr[i] + arr[j], 0) + 1);
            }
        }
        return result;
    }
}