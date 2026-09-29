package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class SolutionfindDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
    	
    	Arrays.sort(nums);
    	//12233478
    	for(int i : nums) {
    		System.out.print(i);
    	}
    	
    	HashSet<Integer> set = new HashSet<Integer>();
    	
    	List<Integer> list = new ArrayList<Integer>();
    	
    	for( int i : nums) {
    		set.add(i);
    	}
    	
    	for(int i=1;i<=nums.length;i++) {
    		
    		if(!set.contains(i)) {
    			
    			list.add(i);
    			
    		}
    		
    	}
    	
    	System.out.println(list.toString());
    	
		return list;
    }
}

public class findDisappearedNumbers {

	public static void main(String[] args) {
		
		SolutionfindDisappearedNumbers sol = new SolutionfindDisappearedNumbers();
		
		int[] arr = {1,1};
		sol.findDisappearedNumbers(arr);
		
	}
	
}
