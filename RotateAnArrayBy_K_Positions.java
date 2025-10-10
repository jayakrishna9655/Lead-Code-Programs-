package Programs;

public class RotateAnArrayBy_K_Positions {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5};
		int k=2;
		int n=arr.length;
		for(int i=0;i<k;i++) {
			
			int l = arr[n-1];
			
			for(int j=n-1;j>0;j--) {
				System.out.println(arr[j] +"j      j-1 "+arr[j-1]);
				arr[j]=arr[j-1];
				//System.out.println(j);
			}
		   
			arr[0]=l;
				
		}
			for(int a : arr) {
				System.out.println(a);
			}
		

	}

}
