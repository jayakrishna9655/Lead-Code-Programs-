package Programs;

class SolutionValidPalindrome {
	
    public boolean isPalindrome(String s) {
    	
    	s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
    	String temp="";
    	for(int i=0;i<s.length();i++) {
    		temp = s.charAt(i)+temp;
    	}
    	if(temp.equals(s)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
}

public class ValidPalindrome {

	public static void main(String[] args) {
		
		SolutionValidPalindrome solutionValidPalindrome = new SolutionValidPalindrome();
//		solutionValidPalindrome.isPalindrome("A man, a plan, a canal: Panama");
		System.out.println("1 :"+solutionValidPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println("2 :"+solutionValidPalindrome.isPalindrome("race a car"));
		System.out.println("3 :"+solutionValidPalindrome.isPalindrome(" "));
		
	}
	
}
