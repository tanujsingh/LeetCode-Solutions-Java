class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()) {
            return "";
        }
        int minLeft = 0;
        int minRight = 0;
        int min = s.length();
        int count = t.length();
        boolean flag = false;
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < t.length(); ++i) {
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
        }
        int left = 0;
        int right = 0;
        while (right < s.length()) {
            char ch = s.charAt(right);
            if(map.containsKey(ch)) {
                map.put(ch, map.getOrDefault(ch, 0) - 1);
                if (map.get(ch) >= 0) {
                    count--;
                }
            }
                while (count == 0 && left <= right) {
                    flag = true;
                    int currLen = right - left + 1;
                    if (currLen <= min) {
                        minRight = right;
                        minLeft = left;
                        min = currLen;
                    }
                    char c = s.charAt(left);
                    if (map.containsKey(c)) {
                        map.put(c, map.getOrDefault(c, 0) + 1);
                        if (map.get(c) >= 1) {
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