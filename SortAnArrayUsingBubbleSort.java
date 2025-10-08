package Programs;

public class SortAnArrayUsingBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        int[] arr = {5, 3, 8, 4, 2};
        int n = arr.length;

        // Bubble Sort algorithm
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                	
                    int temp = arr[j];
                    System.out.println("temp "+temp+"  arr[j]"+arr[j]);
                    arr[j] = arr[j + 1];
                    System.out.println("arr[j] "+arr[j]+"  arr[j]"+arr[j+1]);
                    arr[j + 1] = temp;
                    System.out.println("  arr[j]"+arr[j+1]+"  temp"+temp);
                }
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
	}

}
