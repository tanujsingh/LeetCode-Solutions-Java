class Solution {
    public int[][] highFive(int[][] items) {
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        List<int[]> res = new ArrayList<>(); 
        
        for(int i = 0; i < items.length; ++i){
            map.putIfAbsent(items[i][0], new PriorityQueue<>());
            map.get(items[i][0]).add(items[i][1]);
            if(map.get(items[i][0]).size() > 5) {
                map.get(items[i][0]).poll();
            }
        }
        
        for(int key : map.keySet()) {
            int sum = 0;
            for(int i = 0; i < 5; ++i){
                sum += map.get(key).poll();
            }
            res.add(new int[]{key, sum/5});
        }
        
        int[][] resArr = new int[res.size()][];
        return res.toArray(resArr);
    }
}