package Programs;

public class PalindromeNumber {

	public static void main(String[] arg) {
		int p = 1211;
		int rev=0;
		int tem = 0;
		int org=p;
		while(p > 0) {
		tem=p%10;
		rev=rev*10+tem;
		p=p/10;
		}
		System.out.println("rev :"+rev);
		if(org == rev) {
			System.out.println("p is true");
		}else {
			System.out.println("p is not");
		}
	}
}
