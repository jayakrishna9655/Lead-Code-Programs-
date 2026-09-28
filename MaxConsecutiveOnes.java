package Programs;

class SolutionfindMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
    	
    	int count=0;
    	int maxcount=0;
    	for(int i=0;i<nums.length;i++) {
    		
    		if(nums[i]==1) {
    			count++;
    		}
    		else {
    			count=0;
    		}
    		
    		if(count > maxcount) {
    			maxcount = count;
    		}
    		
    	}
    	
    	System.out.println(maxcount);
    	
		return maxcount;
    }
}

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		
		int[] arr= {1,0,1,1,0,1};
		
		SolutionfindMaxConsecutiveOnes sol = new SolutionfindMaxConsecutiveOnes();
		
		sol.findMaxConsecutiveOnes(arr);
		
	}
	
}
