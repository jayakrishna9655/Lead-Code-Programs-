package Programs;

import java.util.HashSet;

class SolutionHasDuplicate {
    public boolean hasDuplicate(int[] nums) {
    	
    	HashSet<Integer> set = new HashSet<Integer>();
    	
    	for(int i=0;i<nums.length;i++) {
    		
    		if(set.contains(nums[i])) {
    			return true;
    		}
    		
    		set.add(nums[i]);
    		
    	}
    	
		return false;
    }
}

public class ContainsDuplicate {

	public static void main(String[] args) {
		
		SolutionHasDuplicate sol = new SolutionHasDuplicate();
		
		int[] nums = {1, 2, 3, 4};
		
		System.out.println(sol.hasDuplicate(nums));
		
	}
	
}
