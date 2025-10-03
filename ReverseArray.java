package Programs;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] res= {1,2,3,4,5};
		int resLen = res.length;
		int[] tem= new int[resLen];
		for(int i=resLen-1,j=0;i>=0;i--,j++) {
			tem[j] = res[i];
			System.out.println(tem[j]);	
		}
		
	}

}
