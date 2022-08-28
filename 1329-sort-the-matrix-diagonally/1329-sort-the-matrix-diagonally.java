class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        
        Map<Integer, Queue<Integer>> diag = new HashMap<>();
        
        for(int i = 0; i < m; ++i) {
            for(int j = 0; j < n; ++j) {
                diag.putIfAbsent(i - j, new PriorityQueue());
                diag.get(i - j).add(mat[i][j]);
            }
        }
        
        for(int i = 0; i < m; ++i) {
            for(int j = 0; j < n; ++j) {
                mat[i][j] = diag.get(i - j).remove();
            }
        }
        return mat;
    }
}