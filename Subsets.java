package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class SolutionSubsets {
    public List<List<Integer>> subsets(int[] nums) {
    	
    	List<List<Integer>> list = new ArrayList<List<Integer>>();
    	bruteforce(nums,list,0,new ArrayList<Integer>());
    	//System.out.println(list.toString());
		return list;
    }

	private void bruteforce(int[] nums, List<List<Integer>> list, int start, ArrayList<Integer> arrayList) {
		
		list.add(new ArrayList<>(arrayList));
		
		for(int i=start;i<nums.length;i++) {
			
			arrayList.add(nums[i]);
			System.out.println(arrayList);
			bruteforce(nums, list, i+1, arrayList);
			
			arrayList.remove(arrayList.size()-1);
			
		}
		
	}
}

public class Subsets {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3};
		
		SolutionSubsets sol = new SolutionSubsets();
		System.out.println(sol.subsets(arr));
		
	}
	
}
