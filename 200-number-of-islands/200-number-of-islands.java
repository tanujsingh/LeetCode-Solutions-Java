class Solution {
    public int numIslands(char[][] grid) {
        int ans = 0;
        
        for(int i = 0; i < grid.length; ++i) {
            for(int j = 0; j < grid[0].length; ++j) {
                if(grid[i][j] == '1') {
                    ans++;
                    dfs(i, j, grid);
                }
            }
        }
        
        return ans;
    }
    
    private void dfs(int r, int c, char[][] grid) {
        if (r < 0 || r > grid.length - 1 || c < 0 || c > grid[0].length - 1 || grid[r][c] == '0') return;
        
        grid[r][c] = '0';
        dfs(r + 1, c, grid);
        dfs(r - 1, c, grid);
        dfs(r, c + 1, grid);
        dfs(r, c - 1, grid);
    }
}