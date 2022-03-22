class Solution {
    public double average(int[] salary) {
        int minSal = salary[0];
        int maxSal = salary[0];
        int totalSal = 0;
        for(int sal : salary) {
            if (sal > maxSal) {
                maxSal = sal;
            }
            
            if (sal < minSal) {
                minSal = sal;
            }
            
            totalSal += sal;
        }
        
        return (double)(totalSal - maxSal - minSal)/(salary.length - 2); 
    }
}