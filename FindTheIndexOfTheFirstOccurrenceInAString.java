package Programs;

class FindTheIndexOfTheFirstOccurrenceInAStringSolution{
	
    public int strStr(String haystack, String needle) {
    	int tem=-1;
    	for(int i=0;i<haystack.length();i++) {
    		if(haystack.charAt(i) == needle.charAt(i)) {
    				tem=i;
    		}
    		else {
    			 tem=-1;
    		}
    	}
    	
    	return tem;
    }
	
}

public class FindTheIndexOfTheFirstOccurrenceInAString {

	public static void main(String[] args) {
		
		String haystack = "hello", needle = "ll";
		
		FindTheIndexOfTheFirstOccurrenceInAStringSolution sol = new FindTheIndexOfTheFirstOccurrenceInAStringSolution();
		System.out.println(sol.strStr(haystack, needle));
		
	}
	
}
