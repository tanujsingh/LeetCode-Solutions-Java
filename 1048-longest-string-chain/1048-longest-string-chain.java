class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words, (a, b) -> a.length() - b.length());
        
        Map<String, Integer> map = new HashMap<>();
        
        for (String word : words) {
            map.put(word, 1);
        }
    
        int max = 0;
        
        for (String word : words) {
            for (int i = 0; i < word.length(); ++i) { 
                String previous = word.substring(0, i) + word.substring(i+1);

                if (map.containsKey(previous)) {
                    map.put(word, Math.max(map.get(word), 1 + map.get(previous)));
                }
            }
            
            max = Math.max(max, map.get(word));
        }
        
        return max;
    }
}