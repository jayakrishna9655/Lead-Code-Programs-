package Programs;

public class CountTheFrequencyOfEachCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="jaija";
		  char[] ch = str.toCharArray();
		   boolean vi[] = new boolean[ch.length];
		
   for(int i =0;i<str.length()-1;i++) {
	   int count=1;
	 
	   if(vi[i]) {
		   continue;
	   }
	   for(int j=i+1;j<str.length();j++) {
		   if(ch[i]==ch[j]) {
			   count++;
			  // count++;
			   vi[j]=true;
			  // System.out.println(str.charAt(i)+"  -  "+count);
		   }

	   }
	  
	   System.out.println(ch[i]+"  -  "+count);
	  
   }

	}

}
