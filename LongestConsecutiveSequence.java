package Programs;

import java.util.Arrays;

class SolutionLongestConsecutive {
    public int longestConsecutive(int[] nums) {
    	
    	Arrays.sort(nums);
    	int count=1;
    	int max=1;
    	for(int i =1;i<nums.length;i++) {
    		
    		if(nums[i] == nums[i-1]) {
    			continue;
    		}
    		
    		if(nums[i] == nums[i-1]+1) {
    			count++;
    		}
    		else {
    			count=0;
    		}
    		
    		if(count>max) {
    			max=count;
    		}
    		
    	}
    	
    	System.out.println(max);
		return max;
    }
}

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		
		int nums[] = {100,4,200,1,3,2};

		SolutionLongestConsecutive sol = new SolutionLongestConsecutive();
		
		sol.longestConsecutive(nums);
		
	}
	
}
