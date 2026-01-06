package Programs;

public class Merge_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums1 = {1,2,3,0,0,0},  nums2 = {2,5,6} ;
		int m = 3,n = 3;
		
		  int i = m - 1;      
	        int j = n - 1;       
	        int k = m + n - 1;   

	        while (i >= 0 && j >= 0) {
	            if (nums1[i] > nums2[j]) {
	                nums1[k] = nums1[i];
	                i--;
	            } else {
	                nums1[k] = nums2[j];
	                j--;
	            }
	            k--;
	        }

	       
	        while (j >= 0) {
	            nums1[k] = nums2[j];
	            j--;
	            k--;
	        }
	}

}
