// Bottom-up Approach
class Solution {
    public int deleteAndEarn(int[] nums) {
        Map<Integer, Integer> points = new HashMap<>();
        int maxNum = 0;
        
        for(int num : nums){
            points.put(num, points.getOrDefault(num, 0) + num);
            maxNum = Math.max(maxNum, num);
        }
        
        int twoBack = 0;
        int oneBack = points.getOrDefault(1, 0);
        int curr = maxNum == 1 ? oneBack : 0;
        for(int num = 2; num < maxNum + 1; num++) {
            int gain = points.getOrDefault(num, 0);
            curr = Math.max(oneBack, twoBack + gain);
            twoBack = oneBack;
            oneBack = curr;
        }
        return curr;
    }
}