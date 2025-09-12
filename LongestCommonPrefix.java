package Programs;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String[] str = {"flower","flow","flight"};

	        StringBuilder ans = new StringBuilder();
	        Arrays.sort(str);
	        String first = str[0];
	        String last = str[str.length-1];
	        for (int i=0; i<Math.min(first.length(), last.length()); i++) {
	            if (first.charAt(i) != last.charAt(i)) {
	               System.out.println(ans.toString());
	               break;
	            }
	            ans.append(first.charAt(i));
	            
	        }
	}

}
