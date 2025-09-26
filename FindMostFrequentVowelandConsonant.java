package Programs;

public class FindMostFrequentVowelandConsonant {
    private static char[][] freg;

	public static void main(String[] args) {
        String s = "successes";

        int[] freq = new int[256];  // ASCII size

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }
        
        char mostVowel = ' ';
        char mostConsonant = ' ';
        int maxVowelCount = 0;
        int maxConsonantCount = 0;
        
        for(int i =0;i<s.length();i++) {
        	char ch = s.charAt(i);
        	
        	if(freq[ch]>maxConsonantCount) {
        		maxConsonantCount = freq[ch];
        		mostConsonant=ch;
        		
        	}
        	else {
        		if("aeiou".indexOf(ch)!=-1) {
        			mostVowel=ch;
        			maxVowelCount=freq[ch];
        		}
        	}
        	
        }
        System.out.println("mostVowel :" + mostVowel);
        System.out.println("maxVowelCount :" + maxVowelCount);
        System.out.println("mostConsonant :" + mostConsonant);
        System.out.println("maxConsonantCount :" + maxConsonantCount);
        
    }
}
