package Programs;

public class searchAnElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,2,3,4,5,6};
		int target=3;
		int res=0;
		
		for(int i=0;i<arr.length;i++) {
			if(target == arr[i]) {
				res=arr[i];
			}
		}
		System.out.println("Result "+res);

	}

}
