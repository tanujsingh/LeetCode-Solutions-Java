
class Solution {
    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, (s1, s2) -> {
           String[] split1 = s1.split(" ", 2);
           String[] split2 = s2.split(" ", 2);
           
           boolean isDigit1 = Character.isDigit(split1[1].charAt(0));
           boolean isDigit2 = Character.isDigit(split2[1].charAt(0));
            
           if(!isDigit1 && !isDigit2) {
               int comp = split1[1].compareTo(split2[1]);
               if(comp == 0) {
                   return split1[0].compareTo(split2[0]);
               }
               return comp;
           } else if (isDigit1 && isDigit2) {
               return 0;
           } else if (isDigit1 && !isDigit2) {
               return 1; //swap
           } else {
               return -1; //same order
           }
        });
        return logs;    
    }
}