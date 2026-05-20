
package Programs;

class AddTwoNumbers_solution{
	
	public void addIt(int[] arr1,int[]arr2) {
		
		int num1 = 0;
		int num2 = 0;
		for(int i=arr1.length-1;i>=0;i--) {
			num1 =num1 * 10 + arr1[i];
		}
		for(int i=arr2.length-1;i>=0;i--) {
			num2 =num2 * 10 + arr1[i];
		}
		System.out.println(num1);
		System.out.println(num2);
		int tol=num1 + num2;
		
		String str = String.valueOf(tol);
		int[] narr = new int[str.length()];

		for (int i = str.length()-1; i >=0 ; i--) {
		    narr[i] = str.charAt(i) - '0';
		}
		for(int i : narr) {
			System.out.print(i);
		}
		
	}
	
}

public class AddTwoNumbers {
	
	public static void main(String[] args) {
		AddTwoNumbers_solution obj = new AddTwoNumbers_solution();
		int[] arr1= {1,2,3};
		int[] arr2= {1,2,3};
		
		obj.addIt(arr1, arr2);
	}

}
