package Programs;

class SolutionValidPalindrome {
	
    public boolean isPalindrome(String s) {
    	
    	String Rawdata = s.replaceAll("[^a-zA-Z0-9]", "");
    	String lowRawdata = Rawdata.toLowerCase();
    	String RelowRawdata ="";
    	for(int i=lowRawdata.length()-1;i>=0;i--) {
    		RelowRawdata += lowRawdata.charAt(i);
    	}
    	System.out.println(RelowRawdata);
    	System.out.println(lowRawdata);
    	if(lowRawdata.equals(RelowRawdata)) {
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
		
		System.out.println("1 :"+solutionValidPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println("2 :"+solutionValidPalindrome.isPalindrome("race a car"));
		System.out.println("3 :"+solutionValidPalindrome.isPalindrome(" "));
		//solutionValidPalindrome.isPalindrome("race a car");
		//solutionValidPalindrome.isPalindrome(" ");
		
	}
	
}
