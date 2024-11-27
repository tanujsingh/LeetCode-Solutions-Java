class Solution {
    public String customSortString(String order, String s) {
        Map<Character, Integer> map = new HashMap<>();
        int n = s.length();
        for (int i = 0; i < n; ++i) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        
        char[] chars = new char[n];
        int j = 0;
        for (int i = 0; i < order.length(); ++i) {
            char ch = order.charAt(i);
            if (map.containsKey(ch)) {
                while (map.get(ch) > 0) {
                    chars[j++] = ch; 
                    map.put(ch, map.getOrDefault(ch, 0) - 1);
                }
            }
        }

        for (Character ch : map.keySet()) {
            while (map.get(ch) > 0) {
                chars[j++] = ch; 
                map.put(ch, map.getOrDefault(ch, 0) - 1);
            }
        }

        return new String(chars);
        
    }
}