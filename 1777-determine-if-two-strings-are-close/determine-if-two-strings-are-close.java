class Solution {
    public boolean closeStrings(String word1, String word2) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        if (word1.length() != word2.length()) return false;

        for (char ch : word1.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        for (char ch : word2.toCharArray()) {
            map2.put(ch, map2.getOrDefault(ch,0) + 1);
        }

        if (!map1.keySet().equals(map2.keySet())) return false;

        List<Integer> map1Freq = new ArrayList<>(map1.values());
        List<Integer> map2Freq = new ArrayList<>(map2.values());
        Collections.sort(map1Freq);
        Collections.sort(map2Freq);

        return map1Freq.equals(map2Freq);


    }
}