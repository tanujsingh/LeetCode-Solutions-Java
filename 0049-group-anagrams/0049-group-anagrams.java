class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs) {
            char[] chars = new char[26];
            for (char ch : str.toCharArray()) {
                chars[ch - 'a']++;
            }
            String key = Arrays.toString(chars);
            if(!map.containsKey(key)) {
                map.put(key, new ArrayList());  
            }
             map.get(key).add(str);
        }
        return new ArrayList(map.values());
    }
}