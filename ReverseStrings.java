package Programs;

class SolutionReverseString {
	
    public void reverseString(char[] s) {
       StringBuilder res= new StringBuilder();
        int coint =0;
    	for(char ch :s) {
    		
			res.append(ch);
			coint++;
    	}
    		System.out.print(res.reverse());
    }
}

public class ReverseStrings {

	public static void main(String[] args) {
		
		char[] s = {'h','e','l','l','o'};
		
		SolutionReverseString sol = new SolutionReverseString();
		
		sol.reverseString(s);
		
	}
	
}
