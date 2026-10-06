package Programs;

import java.util.Stack;

class SolutiondecodeString {
    public String decodeString(String s) {
    	
//    	Stack<String> stack = new Stack<String>();
//    	
//    	String tem = "";
//    	for(int i=0;i<s.length();i++) {
//    		
//    		char ch =s.charAt(i);
//    		
//    		if(ch !=']') {
//    			stack.push(String.valueOf(ch));
//    		}
//    		else {
//    			 tem = "";  //"3[a]2[bc]"
//    			while(!stack.isEmpty()) {
//    				 
//    	    		if (stack.peek().equals("[")) {
//    	    			
//    	    			stack.pop();
//    	    			StringBuilder numStr = new StringBuilder();
//    	    			while (!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0))) {
//    	    			    numStr.insert(0, stack.pop());
//    	    			}
//    	    			int n = Integer.parseInt(numStr.toString());
//    	    			String org = tem;  //cc
//    	    			for(int j=1;j<n;j++) {
//    	    				tem +=org; //cc cc
//    	    			}
//    	    			stack.push(tem);
//    	    			break;
//    	    			
//    	    		}
//    	    		else {
//    	    			tem =stack.pop() + tem; //a cccc
//    	    		}
//    	    		
//    	    	}
//    		}
//    		
//    	}
//    	
//    	System.out.println(tem);
		
    	
    	
    	
    	
//    	Stack<Integer> stackInt = new Stack<Integer>();
//    	for(int i=0;i<s.length();i++) {
//    		
//    		if(s.charAt(i) !=']') {
//    			
//    			if(Character.isDigit(s.charAt(i))) {
//    				stackInt.push(Character.getNumericValue(s.charAt(i)));
//    			}
//    			else {
//    				stack.push(String.valueOf(s.charAt(i)));
//    			}
//    		}
//    		
//    	}
//    	
//    	
//    	System.out.println("stack "+stack.toString());
//    	System.out.println("stackInt "+stackInt.toString());
//    	
//    	String res = "";
//    	System.out.println(stack);
//    	while(!stack.isEmpty() && !stackInt.isEmpty()) {
////    		res = "";
//    		if(!stack.peek().equals("[")) {
//    			System.out.println(res);
//    			res += stack.pop();
//    		}
//    		else {
//    			stack.pop();
//    			String temp = res;
//    			int n = stackInt.pop(); 
//                System.out.println(n);
//    			for (int i = 1; i <n; i++) {
//    			    res += temp;
//    			}
//    			stack.push(res);
//    			
//    		}   		
//    	}
//    	System.out.println(res);
//    	System.out.println("stack "+stack.toString());
//    	System.out.println("stackInt "+stackInt.toString());
//    	System.out.println(stack.peek());
//    	System.out.println(stackInt.peek());
    	Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        
        String currentString = "";
        int currentNum = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                // Handles multi-digit numbers like 10, 100
                currentNum = currentNum * 10 + (ch - '0');
            } 
            else if (ch == '[') {
                // Save state to stack before going deeper
                countStack.push(currentNum);
                stringStack.push(currentString);
                
                // Reset trackers for the content inside brackets
                currentNum = 0;
                currentString = "";
            } 
            else if (ch == ']') {
                // Pop the multiplier and the previous string
                int k = countStack.pop();
                String prevString = stringStack.pop();

                // Repeat the decoded segment
                String repeated = "";
                for (int j = 0; j < k; j++) {
                    repeated = repeated + currentString;
                }

                // Append to what was saved prior to '['
                currentString = prevString + repeated;
            } 
            else {
                // Regular characters
                currentString = currentString + ch;
            }
        }

        return currentString;
    }
}

public class DecodeString {

	public static void main(String[] args) {
		
		String s = "3[a]2[bc]";
		
		SolutiondecodeString sol= new SolutiondecodeString();
		
		sol.decodeString(s);
		
	}
	
}
