package Programs;
import java.util.*;
class SolutiongenerateParentheses{
	
	
	    public List<String> generateParenthesis(int n) {
	        List<String> result = new ArrayList<>();
	        build(result, "", 0, 0, n);
	        return result;
	    }

	    private void build(List<String> result, String current, int open, int close, int n) {
	    	
	    	if(current.length() == 2*n) {
	    		result.add(current);
	    		return;
	    	}
	    	
	    	if(open<n) {
	    		build(result, current+'(', open+1, close, n);
	    	}
	    	
	    	if(close<open) {
	    		build(result, current+')', open, close+1, n);
	    	}
	       
	    }
	
}

public class generateParentheses {

	public static void main(String[] args) {
		SolutiongenerateParentheses sol = new SolutiongenerateParentheses();
//		sol.generateParenthesis(3);
		System.out.println(sol.generateParenthesis(3));
	}
	
}
