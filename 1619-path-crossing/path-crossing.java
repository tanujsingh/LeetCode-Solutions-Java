class Solution {
    public boolean isPathCrossing(String path) {
        Set<Pair<Integer, Integer>> set = new HashSet<>();
        set.add(new Pair<>(0,0));
    
        int x = 0;
        int y = 0;
    
        for(char ch : path.toCharArray()) {
            if(ch == 'N') y += 1;
            if(ch == 'S') y -= 1;
            if(ch == 'E') x += 1;
            if(ch == 'W') x -= 1;
            Pair<Integer, Integer> pair = new Pair<>(x, y);
            if(!set.contains(pair)){
                set.add(pair);
            } else {
                return true;
            }
        }

        return false;

    }
}