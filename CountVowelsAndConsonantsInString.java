package Programs;

public class CountVowelsAndConsonantsInString {

	public static void main(String[] args) {
		
		String str="auijaiohg";
		char[] ar=str.toCharArray();
		String vol ="";
		String ss="";
		int co = 0;
		String cos="";
		for(int i =0;i<str.length();i++) {
			ss=ss+ar[i];
			 if(ss.equals("a") ||ss.equals("e") ||ss.equals("u") ||ss.equals("i") ||ss.equals("o")) {
				 vol +=ss; 
			 }
			 else {
				 cos +=ss;
			 }
			 ss="";
		}
		co=cos.length();
		int vo=vol.length();
		 System.out.println("Vowels : "+vol);
		 System.out.println("Vowels num : "+vo);
		 System.out.println("Consonants : "+cos);
		 System.out.println("Consonants num : "+co);
		

	}

}
