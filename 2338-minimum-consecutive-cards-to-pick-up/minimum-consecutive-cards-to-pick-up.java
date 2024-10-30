class Solution {
    public int minimumCardPickup(int[] cards) {
        int left = 0;
        Set<Integer> set = new HashSet<>();
        int minLen = Integer.MAX_VALUE;
        for (int right = 0; right < cards.length; ++right) {
            if (set.contains(cards[right])) {
                
                while(cards[left] != cards[right]) {
                    set.remove(cards[left]);
                    left++;
                }
    
                minLen = Math.min(minLen, right - left + 1);
                left++;

                
            }
            set.add(cards[right]);
        }
        return minLen == Integer.MAX_VALUE ? -1 : minLen;
    }
}