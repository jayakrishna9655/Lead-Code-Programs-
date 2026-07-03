package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SolutionthreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
		
    	Arrays.sort(nums);
    	
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	
    	for(int i =0;i<nums.length;i++) {
    		
    		if(nums[i]>0) {
    			break;
    		}
    		if(i>0 && nums[i] == nums[i-1]){
    			continue;
    		}
    		
    		int left =i+1;
    		int right=nums.length-1;
    		
    		while(left<right) {
    			
    			int sum = nums[i] + nums[left] + nums[right];
    			
    			if(sum ==0) {
    				
    				res.add(Arrays.asList(nums[i],nums[left],nums[right]));
    				
//    				while(left < right && nums[left] == nums[left+1]) {
//    					left++;
//    				}
//    				while(left < right && nums[right] == nums[right-1]) {
//    					right--;
//    				}
    				left++;
    				right--;
    			}
    			else if(sum <0){
					left++;
				}
    			else {
					right--;
				}
    		}
    		
    	}
    	return res;
    	
    }
}

public class threeSum {
	
	public static void main(String[] args) {
		SolutionthreeSum solv= new SolutionthreeSum();
//		int[] testInput = {-1, 0, 1, 2, -1, -4};
		int[] testInput = {-2, 0, 0, 2, 2};
	    System.out.println("Unique triplets that sum to zero:");
	    System.out.println(solv.threeSum(testInput));
	}

}

//Unique triplets that sum to zero:
//[[-1, -1, 2], [-1, 0, 1]]


//Unique triplets that sum to zero:
//[[-2, 0, 2]]
