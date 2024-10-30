class Solution {
    public int maximumSum(int[] nums) {
        int ans = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            int temp = num;
            int key = 0;
            while(temp != 0) {
                key += temp%10;
                temp /= 10;
            }
            if (map.containsKey(key)) {
                ans = Math.max(ans, map.get(key) + num);
            }
            map.put(key, Math.max(map.getOrDefault(key,0), num));
        }
        return ans;
    }
}