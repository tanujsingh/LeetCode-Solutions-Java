class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[k];
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
        
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        for(int key : map.keySet()) {
            minHeap.add(key);
            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }
        
       int i = 0; 
       while(!minHeap.isEmpty()) {
            result[i++] = minHeap.poll();
        }
        
        return result;
    }
}