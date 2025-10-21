package Programs;

public class FindTheFirstNonRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "aaaji";
		boolean f[] = new boolean[str.length()];
		String min ="";
		for(int i=0;i<str.length();i++) {
			int c=1;
			if(f[i]) {
				continue;
			}
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					c++;
					f[j]=true;
					
					if(f[j]!=true) {
					System.out.println(f[j] +" - "+str.charAt(j));
						return;
					}
				}
			}
			System.out.println(str.charAt(i)+" "+c);
			if(c==1) {
				min=min+str.charAt(i);
				System.out.println("Non Repeated Character "+min);
				return;
			}
		}
		
	}

}
