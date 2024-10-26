class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> count = new HashMap<>();
        count.put('b', 0);
        count.put('a', 0);
        count.put('l', 0);
        count.put('o', 0);
        count.put('n', 0);
        
        for (char ch : text.toCharArray()) {
            if (ch == 'b' || ch == 'a' || ch == 'l' || ch == 'o' || ch == 'n') {
                count.put(ch, count.getOrDefault(ch, 0) + 1);
            }
        }
        
        int ans = Integer.MAX_VALUE;
        
        for (char ch : count.keySet()) {
            if (count.get(ch) == 0) {
                return 0;
            }
            
            if (ch == 'l' || ch == 'o') {
                ans = Math.min(ans, count.get(ch)/2);
            } else {
                ans = Math.min(ans, count.get(ch));
            }
        }
        
        return ans;
        
    }
}