package Programs;


class SolutionMaximumSubarray{
	
     public int maxSubArray(int[] nums) {
    	 int sum=0;
    	 int maxSum=nums[0];
    	 for(int i=0;i<nums.length;i++) {
    		 
    		  sum += nums[i];
    		  
    		  if(maxSum < sum) {
    			  maxSum = sum;
    		  }
    		  
    		  if(sum<0) {
    			  sum=0;
    		  }
    		  
    	 }
		return maxSum;
     }
	
}

public class MaximumSubarray {

	public static void main(String[] args) {
		
		int[] nums = {5,4,-1,7,8};
		
		SolutionMaximumSubarray sol=new SolutionMaximumSubarray();
		System.out.println(sol.maxSubArray(nums));
		
	}
	
}
