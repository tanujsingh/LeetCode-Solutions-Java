class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> map = new HashMap<>();
        String[] strs = paragraph.toLowerCase().split("\\W+");
        int max = 0;
        String res = "";
        for(String str : strs) {
            map.put(str, map.getOrDefault(str, 0) + 1);
            max = Math.max(max, map.get(str));
        }
        for(String s : banned) {
            if(map.containsKey(s)) {
                map.remove(s);
            } 
        }
        max = 0;
        for(String key : map.keySet()) {
            max = Math.max(max, map.get(key));
            if(max == map.get(key)) {
                res = key;
            }
        }
        
        
        return res;
    }
}