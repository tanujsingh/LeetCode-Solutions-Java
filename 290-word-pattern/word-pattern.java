class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] sArr = s.split(" ");
        Map<Character, String> map = new HashMap<>();

        if (sArr.length != pattern.length()) return false;

        for (int i = 0; i < pattern.length(); ++i) {
            if (map.containsKey(pattern.charAt(i)) && !sArr[i].equals(map.get(pattern.charAt(i)))) return false;
            if (!map.containsKey(pattern.charAt(i)) && map.containsValue(sArr[i])) return false;
            map.put(pattern.charAt(i), sArr[i]);
        }
        return true;
    }
}