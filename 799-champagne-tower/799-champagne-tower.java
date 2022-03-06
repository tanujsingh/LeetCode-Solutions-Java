class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        if(poured == 0) return 0;
        List<Double> prevRow = new ArrayList<Double>();
        prevRow.add((double) poured);
        
        for(int i = 0; i < query_row; i++){
            List<Double> currRow = new ArrayList<Double>();
            double inEndGlass = Math.max(0.0,(prevRow.get(0) - 1.0) / 2.0);
            currRow.add(inEndGlass);
            
            for(int j = 1; j < prevRow.size(); j++){
                currRow.add(Math.max(0.0,(prevRow.get(j - 1) - 1.0) / 2.0) + Math.max(0.0,(prevRow.get(j) - 1.0) / 2.0));
            }
            
            currRow.add(inEndGlass);
            prevRow = currRow;
            
        }
        
        return Math.min(1, prevRow.get(query_glass));
        
    }
}