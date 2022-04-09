class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[k];
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(new Comparator<Integer>() {
           @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o1) > map.get(o2) ? 1 : -1;
            }
        });
        
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        for(int key : map.keySet()) {
            minHeap.add(key);
            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }
        
        for(int i = 0; i < k; i++) {
            result[i] = minHeap.poll();
        }
        
        return result;
    }
}