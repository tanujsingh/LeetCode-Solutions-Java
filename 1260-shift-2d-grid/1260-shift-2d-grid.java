class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> result = new ArrayList();
        int rows = grid.length, col = grid[0].length;

        for (int r = 0; r < rows; r++)
            result.add(new ArrayList());

        k %= (rows * col);
        int begin = (rows * col) - k;

        int x = 0;
        for (int i = begin; i < begin + (rows * col); i++) {
            int r = (i / col) % rows, c = i % col;
            result.get(x / col).add(grid[r][c]);
            x++;
        }
        return result;
    }
}
