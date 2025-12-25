package Programs;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abcabcbb";
		int[] freq = new int[256];
        int left = 0, maxLen = 0;
        HashSet<Character> hash = new HashSet<Character>();
        //System.out.println(maxLen);
        
        for(int r =0;r<s.length();r++) {
        	
        	
        	while(hash.contains(s.charAt(r))) {
        		hash.remove(s.charAt(left));
        		left++;
        	}
        	hash.add(s.charAt(r));
        	maxLen =Math.max(maxLen, r-left+1);
        }
        System.out.println(maxLen);
	}

}
