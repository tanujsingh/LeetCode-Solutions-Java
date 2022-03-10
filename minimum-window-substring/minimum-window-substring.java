/*
Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "". The testcases will be generated such that the answer is unique. A substring is a contiguous sequence of characters within the string.
*/
class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }
        
        int minLeft = 0;
        int minRight = 0;
        int min = s.length();
        int count = t.length();
        boolean flag = false;
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int left = 0;
        int right = 0;
        while (right < s.length()) {
            char c = s.charAt(right);
            if (map.containsKey(c)) {
                map.put(c, map.getOrDefault(c, 0) - 1);
                if (map.get(c) >= 0) {
                    count--;
                }
            }
            while (count == 0 && left <= right) {
                flag = true;
                int currLen = right - left + 1;
                if (currLen <= min) {
                    minLeft = left;
                    minRight = right;
                    min = currLen;
                }
                char tmp = s.charAt(left);
                if (map.containsKey(tmp)) {
                    map.put(tmp, map.getOrDefault(tmp, 0) + 1);
                    if (map.get(tmp) >= 1) {
                        count++;
                    }
                }
                left++;
            }
            right++;
        }
        return flag == true ? s.substring(minLeft, minRight + 1) : "";
    }
}