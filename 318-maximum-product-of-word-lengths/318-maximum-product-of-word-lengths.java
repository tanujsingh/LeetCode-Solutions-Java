class Solution {
    public int maxProduct(String[] words) {
        int n = words.length;
        int[] values = new int[n];
        int k = 0;
    
        for(String word : words) {
            for(int i = 0; i < word.length(); ++i) {
                values[k] |= 1<<(word.charAt(i) - 'a'); 
            }
            k++;
        }
        
        int maxProduct = 0;
        for (int i = 0; i < n; ++i) {
            for(int j = i + 1; j < n; ++j) {
                if ((values[i] & values[j]) == 0) {
                    maxProduct = Math.max(maxProduct, words[i].length() * words[j].length());
                }
		    }
        }
        return maxProduct;
    }
}