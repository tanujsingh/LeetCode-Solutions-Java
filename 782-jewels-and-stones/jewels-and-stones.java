class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> map = new HashMap<>();
        int ans = 0;
        for(char ch: stones.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        for(char ch: jewels.toCharArray()) {
            if(map.containsKey(ch)) {
                ans += map.get(ch);
            }
        }
        return ans;
    }
}