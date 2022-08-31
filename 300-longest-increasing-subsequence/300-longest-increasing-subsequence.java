class Solution {
    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> sub = new ArrayList<>();
        sub.add(nums[0]);
        
        for(int i = 1; i < nums.length; ++i) {
            if(nums[i] > sub.get(sub.size() - 1)) {
                sub.add(nums[i]);
            } else {
                int j = 0;
                while(nums[i] > sub.get(j)) {
                    j += 1;
                }
                sub.set(j, nums[i]);
            }
        }
        return sub.size();
    }

    /*------------------------T: O(N2) S: O(N) -----------------------------*/
    /*
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, 1);
        
        for(int i = 1; i < n; ++i) {
            for(int j = 0; j < i; ++j) {
                if(nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        
        int maxSeq = 1;
        for(int seq : dp) {
             maxSeq = Math.max(maxSeq, seq);
        }
        
        return maxSeq;
    }
    */
}