package Programs;

class SolutionsmallerNumbersThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {
    	
    	int count=0;
    	int[] tem = new int[nums.length];
    	
    	for(int i=0;i<nums.length;i++) {
    		
    		for(int j=0;j<nums.length;j++) {
    			
    			if(nums[i] > nums[j]) {
    				
    				count++;
    				
    			}
    			
    		}
    		
    		tem[i]=count;
    		count=0;
    		
    	}
    	
    	for(int i : tem) {
    		System.out.println(i);
    	}
    	
		return tem;
    }
}

public class checkWhatAreSmallestNumber {

	public static void main(String[] args) {
		
		SolutionsmallerNumbersThanCurrent sol = new SolutionsmallerNumbersThanCurrent();
		
		int[] arr= {7,7,7,7};
		
		sol.smallerNumbersThanCurrent(arr);
		
	}
	
}
