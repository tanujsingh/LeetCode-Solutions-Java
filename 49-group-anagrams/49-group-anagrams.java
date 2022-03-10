class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; ++i) {
            char[] chars = new char[26];
            for(int j = 0; j < strs[i].length(); ++j) {
                chars[strs[i].charAt(j) - 'a']++;
            }
            String key = Arrays.toString(chars);
            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
                map.get(key).add(strs[i]);
            } else {
                map.get(key).add(strs[i]);
            }
        }
        
        return new ArrayList(map.values());
    }
}