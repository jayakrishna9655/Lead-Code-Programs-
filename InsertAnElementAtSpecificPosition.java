package Programs;

public class InsertAnElementAtSpecificPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,2,3,4,5,6};
		int ins=3;
		int val=10;
		arr[ins-1]=val;
		for(int i : arr) {
			System.out.println(i);
		}
	}

}
