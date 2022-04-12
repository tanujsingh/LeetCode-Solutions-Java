class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> newGrid = new ArrayList<>();
        int m = grid.length;
        int n = grid[0].length;
        k %= (m*n);
        int begin = (m*n) - k;
        
        for(int i = 0; i < m * n ;) {
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j < n; ++j) {
                int pos = (i + begin) % (m*n);
                row.add(grid[pos/n][pos%n]);
                i++;
            }
            newGrid.add(row);
        }
        return newGrid;
    }
}
