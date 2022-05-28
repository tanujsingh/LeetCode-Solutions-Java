class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];
        
        for(int i = 0; i < 9; ++i) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }
        
        for(int i = 0; i < board.length; ++i) {
            for(int j = 0; j < board[0].length; ++j) {
                char ch = board[i][j];
                if(ch != '.') {
                    if(!rows[i].contains(ch)) {
                        rows[i].add(ch);
                    } else {
                        return false;
                    }
                    
                    if(!cols[j].contains(ch)) {
                        cols[j].add(ch);
                    } else {
                        return false;
                    }
                    
                    int bx = (i/3)*3 + j/3;
                    
                    if(!boxes[bx].contains(ch)) {
                        boxes[bx].add(ch);
                    } else {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}