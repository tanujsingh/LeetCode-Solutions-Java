class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] sArr = s.split(" ");
        Map<Character, String> map = new HashMap<>();

        if (sArr.length != pattern.length()) return false;

        for (int i = 0; i < pattern.length(); ++i) {
            char ch = pattern.charAt(i);
            if (map.containsKey(ch) && !sArr[i].equals(map.get(ch))) return false;
            if (!map.containsKey(ch) && map.containsValue(sArr[i])) return false;
            map.put(ch, sArr[i]);
        }
        return true;
    }
}