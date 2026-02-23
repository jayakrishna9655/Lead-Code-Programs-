package basic_programs;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,4};
		int t=5;
		for(int i =0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==t) {
					System.out.println(arr[i]+" "+arr[j]);
				}
				//System.out.println(arr[i]+" "+arr[j]);
			}
		}
		System.out.println("jk");
		
	}

}
