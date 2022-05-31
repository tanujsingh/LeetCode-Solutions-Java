class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<String> set = new HashSet<>();
        int count = 1 << k;
        
        for(int i = 0; i <= s.length() - k; ++i) {
            String str = s.substring(i, i + k);
            if (!set.contains(str)) {
                set.add(str);
                count--;
                if (count == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}