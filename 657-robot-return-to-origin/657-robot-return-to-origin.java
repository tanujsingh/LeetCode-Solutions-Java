class Solution {
    public boolean judgeCircle(String moves) {
       if(moves.length() < 2)
           return false;
        
        int sumHorizontal = 0;
        int sumVertical = 0;
        
        for(char ch : moves.toCharArray()) {
            if(ch == 'R') sumHorizontal += 1;
            else if(ch == 'L') sumHorizontal -= 1;
            else if(ch == 'U') sumVertical += 1;
            else sumVertical -= 1;
            }
        
        return sumVertical == 0 && sumHorizontal == 0;
    }
}