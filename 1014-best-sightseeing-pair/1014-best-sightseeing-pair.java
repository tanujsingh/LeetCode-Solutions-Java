class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int maxScore = values[0];
        int i = 0;
        for(int j = 1; j < values.length; ++j) {
            maxScore = Math.max(maxScore, values[i] + i + values[j] - j);
            
            if(values[i] + i < values[j] + j) {
                i = j;
            }
        }
        
        return maxScore;
    }
}