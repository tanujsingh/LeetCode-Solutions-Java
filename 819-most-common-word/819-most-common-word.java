class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> set = new HashSet<>();
        for(String s : banned) {
            set.add(s); 
        }
        
        Map<String, Integer> map = new HashMap<>();
        String[] strs = paragraph.toLowerCase().split("\\W+");
        int max = 0;
        String res = "";

        for(String str : strs) {
            if(!set.contains(str)) {
                map.put(str, map.getOrDefault(str, 0) + 1);
            }
        }
        
        
        for(String key : map.keySet()) {
            if(map.get(key) > max) {
                max = map.get(key);
                res = key;
            }
        }
        
        return res;
    }
}