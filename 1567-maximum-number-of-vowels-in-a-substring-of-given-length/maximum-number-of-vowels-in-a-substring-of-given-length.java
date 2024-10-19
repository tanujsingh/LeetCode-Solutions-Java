class Solution {
    public int maxVowels(String s, int k) {
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
        int ans = Integer.MIN_VALUE;
        int count = 0;
        int left = 0;
        for (int right = 0; right < s.length(); ++right) {
            if (vowels.contains(s.charAt(right))) count++;
            if (right - left + 1 > k && vowels.contains(s.charAt(left++))) count--;
            ans = Math.max(ans, count);
        } 
        return ans;

    }
}