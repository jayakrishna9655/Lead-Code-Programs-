package Programs;

import java.util.Stack;

class SolutionReplaceDigits {
    public String replaceDigits(String s) {
    	
    	StringBuilder res = new StringBuilder();
//    	String res="";
//		Stack<Character> stack = new Stack<Character>();
//    	for(int i =0;i<s.length();i++) {
//    		stack.add(s.charAt(i));
//    	}
//    	System.out.println(stack);
//    	char pre=0;
//    	stack.reversed();
//    	System.out.println(stack);
//    	while(!stack.isEmpty()) {
//    		if( !Character.isDigit(stack.peek())) {
//    			pre=stack.peek();
//    			res +=String.valueOf(stack.pop());
//    		}
//    		else {
//    			char result = (char) ( pre+ stack.pop());
//    			res +=result;
//    		}
//    	}
    	for(int i =0;i<s.length();i++) {
    		
    		char ch = s.charAt(i);
    		
    		if(Character.isDigit(ch)) {
    			
    			int num = ch - '0';
    			
    			 char result=(char) ( s.charAt(i-1)+ num);
    			 res.append(result);
    			
    		}
    		else {
    			res.append(ch);
    		}
    	}
    	System.out.println(res);
		return res.toString();
    }
}

public class replaceDigitsWithChar {
	
	public static void main(String[] args) {
		
		SolutionReplaceDigits sol = new SolutionReplaceDigits();
		String s="a1c1e1";
		sol.replaceDigits(s);
		
	}
	
}
