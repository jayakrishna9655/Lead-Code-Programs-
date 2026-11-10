package basic_programs;


class SolutionMinSubArrayLen {
    public int minSubArrayLen(int target, int[] nums) {
    	
    	int left=0;
    	int min=nums.length+1;
    	int sum=0;
    	//2,1,5,1,5,3
    	for(int right=0;right<nums.length;right++) {
    		
    		sum += nums[right];
    		
    		while(sum >= target) {
    			
    			//if(sum>target) {
    			min = Math.min(min, right - left + 1);
    			//}
    			
    			sum -= nums[left];
    			left++;
    			
    		}
    		
    	}
    	if(min==nums.length+1) {
    		min=0;
    	}
    	
    	
    	System.out.println(min);
		return min;
		
    }
}

public class MinimumSizeSubarraySum {

	public static void main(String[] args) {
		
		SolutionMinSubArrayLen sol = new SolutionMinSubArrayLen();
		
		int target = 10;
		int[] nums = {2,1,5,4};
		
		sol.minSubArrayLen(target, nums);
	}
	
}
