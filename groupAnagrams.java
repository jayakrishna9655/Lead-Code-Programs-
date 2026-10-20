package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class SolutionGroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
    	
    	HashMap<String, List<String>> map = new HashMap<String, List<String>>();
    	
    	for(String s:strs) {
    		
    		char[] c=s.toCharArray();
    		
    		Arrays.sort(c);
    		
    		String sortStrs = new String(c);
    		
    		if(!map.containsKey(sortStrs)) {
    			map.put(sortStrs, new ArrayList<String>());
    		}
    		map.get(sortStrs).add(s);
    		
    	}
    	
		return new ArrayList<List<String>>(map.values());
    }
}
public class groupAnagrams {

	public static void main(String[] args) {
		
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		
		SolutionGroupAnagrams sol = new SolutionGroupAnagrams();
		
		System.out.println(sol.groupAnagrams(strs));
		
	}
	
}
