package Programs;

import java.util.HashSet;

class SolutionfindErrorNums {
    public int[] findErrorNums(int[] nums) {
    	
    	HashSet<Integer> set = new HashSet<>();

        int duplicate = 0;
        int missing = 0;

        // Find duplicate
        for (int num : nums) {

            if (!set.add(num)) {
                duplicate = num;
            }
        }

      //  System.out.println(set.toString());
        
        // Find missing
        for (int i = 1; i <= nums.length; i++) {

            if (!set.contains(i)) {
                missing = i;
                break;
            }
        }

        return new int[]{duplicate, missing};
    }
}

public class SetMismatch {

	public static void main(String[] args) {
		SolutionfindErrorNums sol = new SolutionfindErrorNums();
		int[] arr = {2,2};
		int[] ans=sol.findErrorNums(arr);
		
		for(int i:ans) {
			System.out.println(i);
		}
	}
	
}
