package Programs;

class MaximumScoreOfSplicedArraySolution{
	
    public int maximumsSplicedArray(int[] nums1, int[] nums2) {
    	
    	int maxNums1=0;
    	int maxNums2=0;
    	int maxNums1Index=0;
    	int maxNums2Index=0; 
    	int maxNums1Sum=0;
    	int maxNums2Sum=0;
    	for(int i=0;i<nums1.length;i++) {
    		if(maxNums1<nums1[i]) {
    			maxNums1=nums1[i];
    			maxNums1Index=i;
    		}
    		if(maxNums2<nums2[i]) {
    			maxNums2=nums2[i];
    			maxNums2Index=i;
    		}
    		
    		maxNums1Sum +=nums1[i];
    		maxNums2Sum +=nums2[i];
    		
    	}
    	
    	if(maxNums1Sum > maxNums2Sum) {
    		
    		if(maxNums1 > maxNums2) {
    			return maxNums1Sum;
        	}
    		else {
    			nums1[maxNums2Index] =maxNums2;
    			maxNums1Sum=0;
    			for(int i=0;i<nums1.length;i++) {
    				maxNums1Sum +=nums1[i];
    			}
    			
    			return maxNums1Sum;
    		}
    	}
    	else {
    		
    		if(maxNums1 > maxNums2) {
    			return maxNums2Sum;
        	}
    		else {
    			nums1[maxNums1Index] =maxNums1;
    			maxNums2Sum=0;
    			for(int i=0;i<nums1.length;i++) {
    				maxNums2Sum +=nums1[i];
    			}
    			
    			return maxNums2Sum;
    		}
    		
    	}
    	
    }
	
}

public class MaximumScoreOfSplicedArray {

	public static void main(String[] args) {
		
		int[] nums1 = {60,60,60}, nums2 = {10,90,10};
		
		MaximumScoreOfSplicedArraySolution sol = new MaximumScoreOfSplicedArraySolution();
		
		System.out.println(sol.maximumsSplicedArray(nums1, nums2));
		
	}
	
}
