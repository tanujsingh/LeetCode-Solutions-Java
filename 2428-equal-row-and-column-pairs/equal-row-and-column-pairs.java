class Solution {
    public int equalPairs(int[][] grid) {
        Map<String, Integer> mapR = new HashMap<>();
        
        for(int[] row : grid) {
            String key = makeKey(row);
            mapR.put(key, mapR.getOrDefault(key, 0) + 1);
        }

        Map<String, Integer> mapC = new HashMap<>();

        for(int c = 0; c < grid[0].length; ++c) {
            int[] col = new int[grid.length];
            for(int r = 0; r < grid.length; ++r) {
                col[r] = grid[r][c];
            }

            String key = makeKey(col);
            mapC.put(key, mapC.getOrDefault(key, 0) + 1);
        }

        int pairs = 0;
        for(String key : mapR.keySet()) {
            if(mapC.containsKey(key)) {
                pairs += mapR.get(key) * mapC.get(key);
            }       
        }

        return pairs;
    }

    private String makeKey(int[] row) {
        StringBuilder sb = new StringBuilder();
        for(int num : row) {
             sb.append(num);
             sb.append("#");    
        }

        return sb.toString();
    }
}