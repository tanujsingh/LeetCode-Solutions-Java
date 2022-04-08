class KthLargest {
   public PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1 > o2 ? 1 : -1;
        }
    });
    private static int k;
    
    public KthLargest(int k, int[] nums) {
        this.k = k;
        for(int num : nums) {
            maxHeap.add(num);
        }
        
        while(maxHeap.size() > k) {
            maxHeap.poll();
        }
    }
    
    public int add(int val) {
        maxHeap.add(val);
        if (maxHeap.size() > k) {
            maxHeap.poll();
        }
        return maxHeap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */