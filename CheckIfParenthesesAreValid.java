package Programs;

import java.util.Stack;

public class CheckIfParenthesesAreValid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> s = new Stack<String>();
		
		String[] ar= {"{)","(]",")(","[]","{}","()"};
		
		for(String v : ar) {
			
			if(v.equals("{}")|| v.equals("[]") || v.equals("()" )) {
				s.add(v);
			}
			
		}
		System.out.println(s);
	}

}
