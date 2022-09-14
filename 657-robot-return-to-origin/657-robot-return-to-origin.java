class Solution {
    public boolean judgeCircle(String moves) {
       if(moves.length() < 2)
           return false;
        
        Stack<Character> stack = new Stack<>();
        int sumHorizontal = 0;
        int sumVertical = 0;
        
        for(char ch : moves.toCharArray()) 
            stack.add(ch);
        
        while(!stack.isEmpty()) {
            char ch = stack.pop();
            
            if(ch == 'L' || ch == 'R'){
                if(ch == 'R')
                    sumHorizontal += 1;
                else
                    sumHorizontal -= 1;
            }
            
            if(ch == 'U' || ch == 'D'){
                if(ch == 'U')
                    sumVertical += 1;
                else
                    sumVertical -= 1;
            }
            
        }
        
        return sumVertical == 0 && sumHorizontal == 0;
    }
}