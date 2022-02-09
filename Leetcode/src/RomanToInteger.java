import java.util.*;
public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RomanToInteger obj = new RomanToInteger();
		System.out.println(obj.romanToInt("MCMXCIV"));
	}
	
	public int romanToInt(String s) {
		Map<Character, Integer> map=new HashMap<>();
		map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int n=s.length();
        int res=map.get(s.charAt(n-1));
        for(int i=n-2;i>=0;--i) {
        	if(map.get(s.charAt(i))>map.get(s.charAt(i+1))) res+=map.get(s.charAt(i));
        	else res-=map.get(s.charAt(i));
        }
        return res;
	}

}
