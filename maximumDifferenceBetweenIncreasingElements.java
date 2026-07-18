package Programs;


class SolutionOfmaximumDifferenceBetweenIncreasingElements{
	
	//{1,5,2,10}
	
    public int maximumDifference(int[] nums) {
//		int sum=0;
//		int min=nums[0];
//		int max=0;
//    	for(int i=0;i<nums.length;i++) {
//    		//for(int j=i+1;j<nums.length;j++) {
//    			
//    			if(nums[i]<min) {
//    				min=nums[i];
//    			}
//    			
//    			if(nums[i]>max) {
//    				max=nums[i];
//    			}
//    				
//    			if(min<max) {
//    				sum=max - min;
//    			System.out.println(max+" - "+min+" = "+sum);
//    			return sum;
//    			}	
    				
    				
//    			
//    			if(nums[i]<nums[j]) {
//    				sum=nums[j] - nums[i];
//    			System.out.println(nums[i]+" - "+nums[j]+" = "+sum);
    			//return sum;
    			//}
    		//}
//    	}
//    	
//    	return sum=-1;
    	
    	int min = nums[0];
        int maxDiff = -1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > min) {
                int diff = nums[i] - min;
                maxDiff = Math.max(maxDiff, diff);
            }

            if (nums[i] < min) {
                min = nums[i];
            }
        }

        return maxDiff;
        
    }
	
}

public class maximumDifferenceBetweenIncreasingElements {

	public static void main(String[] args) {
		
		SolutionOfmaximumDifferenceBetweenIncreasingElements sol = new SolutionOfmaximumDifferenceBetweenIncreasingElements();
		int[] nums= {7,1,5,4};
		System.out.println(sol.maximumDifference(nums));
		
	}
	
}
