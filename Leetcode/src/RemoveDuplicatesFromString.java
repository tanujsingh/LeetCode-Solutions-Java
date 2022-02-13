
public class RemoveDuplicatesFromString {
	
	public String removeDuplicates(String s) {	  
        char[] output = s.toCharArray();
        int pos = 0;
        for(int i = 0; i < s.length(); i++) {
            output[pos] = output[i];
            if(pos > 0 && output[pos - 1] == output[pos])
                pos = pos - 2;
            pos++;
        }
        
        return new String(output, 0, pos);
    }

}
