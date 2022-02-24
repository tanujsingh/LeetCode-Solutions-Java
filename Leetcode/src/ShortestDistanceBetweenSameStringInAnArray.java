
import java.util.*;

public class ShortestDistanceBetweenSameStringInAnArray {
	public int shortestDistance(String[] strs) {
			int distance = Integer.MAX_VALUE;
			Map<String, Integer> map = new HashMap<>();
			
			for(int i = 0; i < strs.length; ++i) {
				if(map.containsKey(strs[i])) {
					distance = Math.min(distance, i - map.get(strs[i]));
				} else {
					map.put(strs[i],i);
				}
			}
		return strs.length == map.size() ? -1 : distance;
	}
}
