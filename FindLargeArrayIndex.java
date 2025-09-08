package Programs;

public class FindLargeArrayValue {

	public static void main(String[] arg) {
		
		int[] array= {1,2,3,4,5,6,7,8,9,10};
		
		int max= array[0];
		int index=0;
		
		for(int i = 1 ;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		System.out.println(max);
		
	}
	
}

