package Programs;

import java.util.Stack;

class SolutionEvalRPN {
    public int evalRPN(String[] tokens) {
    	
    	Stack<String> stack = new Stack<String>();
    	
    	int sum=0;
    	
    	for(int i=0;i<tokens.length;i++) {
    		
    		if(!tokens[i].equals("-") && !tokens[i].equals("+") && !tokens[i].equals("/") && !tokens[i].equals("%") && !tokens[i].equals("*")) {
    			
    			stack.add(tokens[i]);
    			
    		}
    		else {
    			
    			int right= Integer.parseInt(stack.pop());
    			int left= Integer.parseInt(stack.pop());
    			
    			int tem=0;
    			
    			if(tokens[i].equals("-")) {
    				 tem = left - right;	
    			}
    			if(tokens[i].equals("+")) {
    				 tem = left + right;	
    			}
    			if(tokens[i].equals("*")) {
    				 tem = left * right;	
    			}
    			if(tokens[i].equals("/")) {
    				 tem = left / right;	
    			}
    			if(tokens[i].equals("%")) {
    				 tem = left % right;	
    			}
    			
    			stack.add(String.valueOf(tem));
//    			System.out.println(tem);
    		}
    		
    	}
    	if(!stack.isEmpty()) {
   		sum = Integer.parseInt(stack.pop());
    	}
    	
		return sum;
    }
}

public class EvaluateReversePolishNotation {

	public static void main(String[] args) {
		
		String[] tokens = {"4","13","5","/","+"};
		
		SolutionEvalRPN sol = new SolutionEvalRPN();

		System.out.println(sol.evalRPN(tokens));
		
	}
	
}
