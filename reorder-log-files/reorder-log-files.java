
class Solution {
    public String[] reorderLogFiles(String[] logs) {
        PriorityQueue<String> letterLogs = new PriorityQueue<String>(
        Comparator
            .<String,String>comparing(o -> o.split(" ",2)[1])
            .thenComparing(o -> o.split(" ",2)[0]));
        List<String> digitLogs = new ArrayList<String>();
        
        for(String log : logs) {
            if(Character.isDigit(log.split(" ", 2)[1].charAt(0))) {
                digitLogs.add(log);
            } else {
                letterLogs.add(log);
            }
        }
        
        String[] result = new String[logs.length];
        int i = 0;
        while(!letterLogs.isEmpty()) {
            result[i] = letterLogs.poll();
            i++;
        }
        
        for(String log : digitLogs) {
            result[i] = log;
            i++;
        }
        
        return result;
            
    }
}