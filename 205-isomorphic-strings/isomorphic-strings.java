class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        if (s.length() != t.length())
            return false;

        for (int i = 0; i < s.length(); ++i) {
            if (map.containsKey(s.charAt(i)) && t.charAt(i) != map.get(s.charAt(i)))
                return false;
            if (!map.containsKey(s.charAt(i)) && map.containsValue(t.charAt(i)))
                return false;
            map.put(s.charAt(i), t.charAt(i));
        }
        return true;
    }
}