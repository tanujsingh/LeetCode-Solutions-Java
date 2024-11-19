class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        List<Map.Entry<Character, Integer>> sortedMap = new ArrayList<>(map.entrySet());
        Collections.sort(sortedMap, (a, b) -> b.getValue().compareTo(a.getValue()));

        sortedMap.forEach(mapper -> {
            int count = mapper.getValue();
            while (count != 0) {
                sb.append(mapper.getKey());
                count--;
            }
    });

        return sb.toString();

    }
}