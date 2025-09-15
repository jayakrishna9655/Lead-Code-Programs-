package Programs;

import java.nio.file.attribute.AclEntry;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] nums= {1,2,2,3,4,5};
//		int val = 2;
//        int k = 0;
//        for(int i=0;i<nums.length;i++){
//          
//        	   if(nums[i]!=val ) {
//        		  nums[k]=nums[i];
//                  k++;
//                  System.out.println(k);
//        	   }
//        	  
//           
//        }
		
		int[] nums= {1,2,2,3,4,5};
		int val = 2;
		int k = 0;

		for (int i = 0; i < nums.length; i++) {   
		    if (nums[i] != val) {                 
		        nums[k] = nums[i];
		        System.out.println("inner = " + nums[k] );
		        k++;
		    }
		}

		System.out.println("k = " + k);

		for (int i = 0; i < k; i++) {
		    System.out.print(nums[i]);
		}


      
	}

}
