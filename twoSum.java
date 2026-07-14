package Programs;

import java.util.HashMap;

class twoSumSolution{
	public int[] solution(int[] nums,int target) {
		
        HashMap<Integer, Integer> map =new HashMap<Integer, Integer>();
		
		for(int i=0;i<nums.length;i++) {
			
			int t=target - nums[i];
			
			if(map.containsKey(t)) {
				return new int[] {map.get(t),i};  // 1,2
			}
			
			map.put(nums[i],i); // 1,0  1,1  
			
		}
		
		return new int[] {};
		
	}
}

public class twoSum {


	public static void main(String[] args) {
		
		int[] nums ={1,1,8,5};
		int t=9;
		
		twoSumSolution sol = new twoSumSolution();
		
		for(int i:sol.solution(nums, t)) {
			System.out.println(i);
		}
		
	}
	
}
