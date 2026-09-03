package Programs;

import java.util.HashMap;
import java.util.HashSet;

class SingleNumberSolution {
    public int singleNumber(int[] nums) {
    	int sum=0;
    	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    	HashSet<Integer> set = new HashSet<Integer>();
    	for(int i=0;i<nums.length;i++) {
//    		if(!map.containsValue(nums[i])) {
//    			sum=nums[i];
//    		}
//    		map.put(i, nums[i]);
    		
//    		for(int j=0;j<nums.length;j++) {
//    			if(!map.containsValue(nums[i])) {
//    				sum=nums[i];
//    			}
//    			map.put(j, nums[j]);
//    		}
    		
    		if(! set.add(nums[i])) {
    			set.remove(nums[i]);
    		}
    		System.out.println(set.toString());
    		
    	}
    	System.out.println(set);
    	System.out.println(sum);
		return set.iterator().next();
    }
}

public class SingleNumber {

	public static void main(String[] args) {
		int[] arr= {2,2,1};
		SingleNumberSolution sol = new SingleNumberSolution();
		sol.singleNumber(arr);
		
	}
	
}
