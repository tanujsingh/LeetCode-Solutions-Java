class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int oneStepDown = 0;
        int twoStepDown = 0;
        int minCost = 0;
        for (int i = 2; i < cost.length + 1; ++i) {
            minCost = Math.min(oneStepDown + cost[i - 1], twoStepDown + cost[i - 2]);
            twoStepDown = oneStepDown;
            oneStepDown = minCost;
        }
        return minCost;
    }
}