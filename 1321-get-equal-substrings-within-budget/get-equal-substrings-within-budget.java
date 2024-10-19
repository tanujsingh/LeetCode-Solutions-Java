class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int left = 0;
        char[] strS = s.toCharArray();
        char[] strT = t.toCharArray();
        int strMax = Integer.MIN_VALUE;
        int currCost = 0;

        for (int right = 0; right < strS.length; ++right) {
            currCost += Math.abs(strS[right] - strT[right]);

            while (currCost > maxCost) {
                currCost -= Math.abs(strS[left] - strT[left]);
                left++;
            }

            strMax = Math.max(strMax, right - left + 1);
        }
        return strMax;
    }
}