class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int maxDis = m + n;
        
        for(int i = 0; i < m; ++i) {
            for(int j = 0; j < n; ++j) {
                if(mat[i][j] == 0) {
                    continue;
                }
                int top = maxDis;
                int left = maxDis;
                if(i >= 1) {
                    top = mat[i - 1][j]; 
                }
                if(j >= 1) {
                    left = mat[i][j - 1];
                }
                mat[i][j] = Math.min(top, left) + 1;
            }
        }
        
         for(int i = m - 1; i >= 0; --i) {
            for(int j = n - 1; j >= 0; --j) {
                if(mat[i][j] == 0) {
                    continue;
                }
                int bottom = maxDis;
                int right = maxDis;
                if(i < m - 1) {
                    bottom = mat[i + 1][j]; 
                }
                if(j < n - 1) {
                    right = mat[i][j + 1];
                }
                mat[i][j] = Math.min(mat[i][j], Math.min(bottom, right) + 1);
            }
        }
        return mat;
    }
}