// Bottom-up Approach
class Solution {
    public int deleteAndEarn(int[] nums) {
        Map<Integer, Integer> points = new HashMap<>();
        int maxNum = 0;
        
        for(int num : nums){
            points.put(num, points.getOrDefault(num, 0) + num);
            maxNum = Math.max(maxNum, num);
        }
        
        int[] maxPoints = new int[maxNum + 1]; // 0 to maxNum;
        maxPoints[1] = points.getOrDefault(1, 0);

        for(int num = 2; num < maxPoints.length; num++) {
            int gain = points.getOrDefault(num, 0);
            maxPoints[num] = Math.max(maxPoints[num - 1], maxPoints[num - 2] + gain);
        }
        return maxPoints[maxNum];
    }
}