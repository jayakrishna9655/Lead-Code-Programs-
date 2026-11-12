package Programs;


class SolutionMaxVowels {
	
    public int maxVowels(String s, int k) {
    	
    	int left=0;
    	int maxcount=0;
    	for(int i=0;i<s.length();i++) {
    		
    		char ch=s.charAt(i);
    		
    		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
    			
    			maxcount++;
    			
    		}
    		
    		if(maxcount == k) {
    			System.out.println(maxcount);
    			return maxcount;
    		}
    		
    	}
    	System.err.println(maxcount);
		return maxcount;
        
    }
    
}
public class MaximumNumberOfVowelsSubstringGivenLength {

	public static void main(String[] args) {
		
		String s = "leetcode";
		int k = 3;
		SolutionMaxVowels sol = new SolutionMaxVowels();
		
		sol.maxVowels(s, k);
	}
	
}
