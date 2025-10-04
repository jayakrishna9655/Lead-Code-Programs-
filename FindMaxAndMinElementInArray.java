package Programs;

public class FindMaxAndMinElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {11,2,3,10,4,5,1,6,7,8};
		int max=arr[0],min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
			}
		System.out.println(max);
		System.out.println(min);
		
		
		}
	}


