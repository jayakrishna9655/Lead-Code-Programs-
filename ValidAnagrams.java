package Programs;

import java.util.HashMap;
import java.util.Stack;

class SolutionIsAnagram {
    public boolean isAnagram(String s, String t) {
    	
Stack<String> stack = new Stack<String>();
    	
    	for(int i =0;i<s.length();i++) {
    		stack.push(String.valueOf(s.charAt(i)));
    	}
    	
    	if(stack.size() != t.length()) {
    		return false;
    	}
    	
    	for(int i=0;i<t.length();i++) {
    		
    		if(!stack.contains(String.valueOf(t.charAt(i)))) {
    			return false;
    		}
    		else {
    			if(!stack.isEmpty()) {
    				stack.remove(String.valueOf(t.charAt(i)));
    			}
    		}
    	}
    	System.out.println(stack);
    	return true;
    	
//    	if(s.length() != t.length()) {
//    		return false;
//    	}
//    	
//    	HashMap<Integer, String> map_s = new HashMap<Integer, String>();
//    	
//    	for(int i =0;i<s.length();i++) {
//    		map_s.put(i, String.valueOf(s.charAt(i)));
//    	}
//    	
//    	for(int i=0;i<t.length();i++) {
//    		
//    		if(!map_s.containsValue(String.valueOf(t.charAt(i)))) {
//    			return false;
//    		}
//    		else {
//    			map_s.re;
//    		}
//    	}
    	
    	
//		return true;
    }
}

public class ValidAnagrams {

	public static void main(String[] args) {
		
		String s = "hhcc", t = "chcc";
		
		SolutionIsAnagram sol = new SolutionIsAnagram();
		
		System.out.println(sol.isAnagram(s, t));
		
	}
	
}
