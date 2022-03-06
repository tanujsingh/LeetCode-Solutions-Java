class Solution {
    int poured;
    Double[][] memo;
    public double champagneTower(int poured, int query_row, int query_glass) {
        this.poured = poured;
        this.memo = new Double[query_row+1][query_glass+1];
        double ans = dp(query_row, query_glass);
        return Math.min(1, ans);
    }
    
    // dp(r, c) means the amount of champagne is poured into cup[r, c]
    double dp(int r, int c) {
        if (c < 0 || c > r) return 0; // Invalid position
        if (r == 0 && c == 0) return poured; // Amount Champaign is poured into the top cup
        if (memo[r][c] != null) return memo[r][c];
        return memo[r][c] = Math.max(dp(r-1, c-1) - 1, 0) / 2 + Math.max(dp(r-1, c) - 1, 0) / 2;
    }
}