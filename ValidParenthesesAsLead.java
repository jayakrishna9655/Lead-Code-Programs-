package Programs;

import java.util.Stack;

class SolutionValidParenthesesAsLead{
	
	public Boolean Solution(String s) {
		
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[') {
				stack.push(s.charAt(i));
			}
			else {
				
				if(stack.empty()) {
					return false;
				}
				
				Character top = stack.pop();
				
				if((top !='(' && s.charAt(i)==')') || (top !='{' && s.charAt(i)=='}') || (top !='[' && s.charAt(i)==']') ){
					System.out.println(s.charAt(i) +"  "+top);
					return false;
				}
				
			}
			
		}
		
		if(stack.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
		
	}
}

public class ValidParenthesesAsLead {

	public static void main(String[] args) {
		
		SolutionValidParenthesesAsLead sol=new SolutionValidParenthesesAsLead();
		System.out.println(sol.Solution("(){}[]"));
		
	}
	
}
