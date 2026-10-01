package Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class SolutionBuildArray {
    public List<String> buildArray(int[] target, int n) {
    	Stack<Integer> stack = new Stack<Integer>();
    	List<String> list = new ArrayList<String>();
    	
    	for(int i=0;i<target.length;i++) {
    		stack.add(target[i]);
    	}
    	System.out.println(stack.toString());
    	for(int i=1;i<=n;i++) {
    		
    		if(stack.contains(i)) {
    			list.add("Push");
    			if(i == target[target.length-1]) {
    				break;
    			}
    		}
    		else {
    			list.add("Push");
    			list.add("Pop");
    		}
    		
    	}
    	
    	System.out.println(list.toString());
    	
		return list;
    }
}

public class BuildAnArrayWithStackOperations {
	public static void main(String[] args) {
		int[] target = {1,3};
		int n = 3;
		SolutionBuildArray sol = new SolutionBuildArray();
		 sol.buildArray(target, n);
	}
	
}
