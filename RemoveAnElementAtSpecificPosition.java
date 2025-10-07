package Programs;

public class RemoveAnElementAtSpecificPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,2,3,4,5,6};
		int del=6;
		int k=0;
		int [] narr = new int [arr.length-1];
		for(int i =0 ; i<arr.length;i++) {
			if(del != arr[i]) {
				narr[k]=arr[i];
				k++;
			}
		}
		for(int val : narr) {
			System.out.println(val);
		}
	}

}
