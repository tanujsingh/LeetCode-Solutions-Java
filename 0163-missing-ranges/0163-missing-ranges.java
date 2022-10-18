class Solution {
  public List<String> findMissingRanges(int[] nums, int lower, int upper) {
      List<String> list = new ArrayList<>();
      
      if(nums.length == 0) {
          list.add(range(lower, upper));
          return list;
      }
      
      if(lower < nums[0]) {
          list.add(range(lower, nums[0] - 1));
      }
      
      for(int i = 0; i < nums.length - 1; ++i) {
          if(nums[i + 1] > nums[i] + 1) {
              list.add(range(nums[i] + 1, nums[i + 1] - 1));
          }
      }
      
      if(nums[nums.length - 1] < upper) {
          list.add(range(nums[nums.length - 1] + 1, upper));
      }
      
      return list;
  }
    
  private String range(int lower, int upper) {
      String str = "";
      if(lower == upper) {
          str = Integer.toString(lower);
      } else {
          str = lower + "->" + upper;
      }
      return str;
  }  
}