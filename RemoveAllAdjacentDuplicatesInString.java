package Programs;

class RemoveAllAdjacentDuplicatesInStringSolution {
    public String removeDuplicates(String s) {
    	
    	StringBuilder sb = new StringBuilder();
    	
    	for(char c : s.toCharArray()) {
    		int len = sb.length();
    		System.out.println(len);
    		if(len >0 && c == sb.charAt(len -1)) {
    			sb.deleteCharAt(len-1);
    		}
    		else {
    			sb.append(c);
    		}
    	}
    	System.out.println(sb.toString());
		return sb.toString();
    }
}

public class RemoveAllAdjacentDuplicatesInString {

	public static void main(String[] args) {
		RemoveAllAdjacentDuplicatesInStringSolution  sol = new RemoveAllAdjacentDuplicatesInStringSolution();
		sol.removeDuplicates("abbaca");
		sol.removeDuplicates("azxxzy");
	}
	
}
