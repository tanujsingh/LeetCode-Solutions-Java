class Solution {
    public int[] sortByBits(int[] arr) {
        List<Integer> res = new ArrayList<>();
        for(int num : arr){
            res.add(num);
        }
        
        Collections.sort(res, (a, b) -> countBits(a) == countBits(b) ? a - b : countBits(a) - countBits(b));
       
        int[] resArr = new int[res.size()];
        
        for(int i = 0; i < res.size(); ++i) {
            resArr[i] = res.get(i);
        }
        
        return resArr;
    }
    
    private int countBits(int num) {
        int ones = 0;
            while(num != 0){
                if((num & 1) == 1)
                    ones += 1;
                num = num >> 1;
            }
            return ones;
    }
}