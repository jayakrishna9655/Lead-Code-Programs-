package Programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

class SolutionExclusiveTime {
    public int[] exclusiveTime(int n, List<String> logs) {
    	
    	int[] res = new int[n];
    	Stack<String> stack = new Stack<String>();
    	int prevTime  =0;
    	
    	for(String s : logs) {
    		 
    		String[] split = s.split(":");
    		
    		int functionId = Integer.parseInt(split[0]);
    		String type = split[1];
    		int time = Integer.parseInt(split[2]);
    		
    		
    		if(type.equals("start")) {
    	    	
    			if(!stack.isEmpty()) {
    				int currectFunction=Integer.parseInt(stack.peek());
    				res[currectFunction] += time - prevTime ;
    			}
    			stack.push(split[0]);
    			prevTime = time;
    	    }
    		else {
    			
    			int currectFunction=Integer.parseInt(stack.pop());
				res[currectFunction] += time - prevTime +1;
				prevTime = time +1;
    		}
    	    
    	}
    	
    	for(int i :res) {
    		System.out.println(i);
    	}
    	
		return res;
    }
}

public class ExclusiveTimeOfFunctions {

	public static void main(String[] args) {
		
		SolutionExclusiveTime sol = new SolutionExclusiveTime();
		
		int n = 2;
		String[] logs = {"0:start:0","1:start:2","1:end:5","0:end:6"};
		List<String> list = new ArrayList<String>();
		
		for(String s : logs) {
			list.add(s);
		}
		
		sol.exclusiveTime(n, list);
		
	}
	
}
