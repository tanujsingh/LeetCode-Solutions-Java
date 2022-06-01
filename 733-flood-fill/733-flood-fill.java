class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int m = image.length;
        int n = image[0].length;
        boolean[][] visited = new boolean[m][n];
        
        int baseColor = image[sr][sc];
        
        dfs(image, sr, sc, baseColor, newColor, visited);
        
        return image;
    }
    
    private void dfs(int[][] image, int r, int c, int baseColor, int newColor, boolean[][] visited) {
        if(r < 0 || c < 0 || r >= image.length || c >= image[0].length || image[r][c] != baseColor || visited[r][c]) {
            return;
        }
        
        visited[r][c] = true;
        
        image[r][c] = newColor;
        dfs(image, r + 1, c, baseColor, newColor, visited);
        dfs(image, r, c + 1, baseColor, newColor, visited);
        dfs(image, r - 1, c, baseColor, newColor, visited);
        dfs(image, r, c - 1, baseColor, newColor, visited);
    }
}