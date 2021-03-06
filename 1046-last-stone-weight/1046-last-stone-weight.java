class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b - a);
        
        for(int stone : stones) {
            maxHeap.add(stone);
        }
        
        int x, y;
        while(maxHeap.size() > 1) {
            x = maxHeap.poll();
            y = maxHeap.poll();
            if(x > y) {
                maxHeap.add(x - y);
            }
        }
        
        return maxHeap.size() == 0 ? 0 : maxHeap.poll();
    }
}