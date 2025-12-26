package Programs;

import java.util.HashSet;

public class LongestRepeatingCharacterReplacement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "AABABBA";
				
		int k = 2;
		int l=0;
		int maxlen=0;
		int maxfre=0;
		int[] cou = new int[26];
		
		for(int r=0;r<s.length();r++) {
			
			cou[s.charAt(r)-'A']++;
			
			maxfre= Math.max(maxfre, cou[s.charAt(r)-'A']);
			
			while((r-l+1)-maxfre > k) {
				cou[s.charAt(l)-'A']--;
				l++;
			}
			maxlen=Math.max(maxfre, r-l +1);
			
			}
		System.out.println(maxlen);
			
		
			
		}

		
	}


