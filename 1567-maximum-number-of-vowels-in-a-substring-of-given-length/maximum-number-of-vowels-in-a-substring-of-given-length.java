class Solution {
    public int maxVowels(String s, int k) {
        char[] strArr = s.toCharArray();
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
        int ans = Integer.MIN_VALUE;
        int nums = 0;
        int left = 0;
        for (int right = 0; right < strArr.length; ++right) {
            if (vowels.contains(strArr[right])) {
                nums++;
            }
            if (right - left + 1 > k) {
                if (vowels.contains(strArr[left])) {
                    nums--;
                }
                left++;
            }

            ans = Math.max(ans, nums);
        } 
        return ans;

    }
}