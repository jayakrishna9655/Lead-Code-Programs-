package Programs;

public class CountTheFrequencyOfEachCharacterInString {

	public static void main(String[] args) {
		
		String str="jaiaj";
		String mx="";
		int fe=0;
		boolean vis[] = new boolean[str.length()];
		
		for(int i=0;i<str.length();i++) {
			
			if(vis[i]) {
				continue;
			}
			int count=1;
			for(int j=i+1;j<str.length();j++) {
				
				
				if(str.charAt(i)==str.charAt(j)) {
				//	System.out.println("j "+str.charAt(j));
				//	System.out.println("i "+str.charAt(i));
					count++;
					fe++;
					mx=str.charAt(i)+mx;
					vis[j]=true;
				}
				
			}
			 System.out.println(str.charAt(i) + " : " + count);
			
		}
		//System.out.println("fe "+fe);
		//System.out.println("mx "+mx);

	}

}
