class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> output = new ArrayList<>();
        
        int start = 0;
        for(int i = 0; i < nums.length; i++){
            start = i;
            String str = Integer.toString(nums[start]);    
            
            while(i < nums.length - 1 && nums[i] + 1 == nums[i + 1]) {
                i++;
            }
            
            if(start != i){
                str = str + "->" + Integer.toString(nums[i]);
                output.add(str);
            } else {
                output.add(str);
            }
        }
        
        return output;
    }
}