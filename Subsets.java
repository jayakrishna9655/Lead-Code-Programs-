package Programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class SolutionSubsets {
    public List<List<Integer>> subsets(int[] nums) {
    	
    	HashSet<List<List<Integer>>> set = new HashSet<List<List<Integer>>>();
    	
    	for(int i=0;i<nums.length;i++) {
    		if(! set.add(Arrays.asList(nums[i])) {
    			
    		}
    	}
    	
    	
		return null;
    }
}

public class Subsets {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3};
		
		SolutionSubsets sol = new SolutionSubsets();
		sol.subsets(arr);
		
	}
	
}
