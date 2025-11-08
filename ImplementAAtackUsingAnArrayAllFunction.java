package Programs;

import java.util.Stack;

public class ImplementAAtackUsingAnArrayAllFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(push, pop, peek)
		String[] ar = {"j","a","i"};
		
		Stack<String> s = new Stack<String>();
		
		for(String v : ar) {
			
			s.push(v);
		
		}
		
		System.out.println("push Stack "+ s);
		
		s.peek();
		
		System.out.println("peek Stack "+ s.peek());
		
		s.pop();
		System.out.println("pop Stack "+ s);
		
	}

}
