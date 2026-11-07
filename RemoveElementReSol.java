package Programs;

class RemoveElementReSolSolution{
	
	public int removeElement(int[] nums, int val) {
		int count=0;
		int[] temp = new int[nums.length];
		for(int i =0;i<nums.length;i++) {
			
			if(nums[i]!=val) {
				nums[count] = nums[i];
				count++;
				
			}
		
		}
//		nums=temp;
		System.out.println(count);
		for(int i:nums) {
			System.err.println(i);
		}
		return count;
    }
	
}

public class RemoveElementReSol {

	public static void main(String[] args) {
		int[] nums = {3, 2, 2, 3};
		int val = 3;
		
		RemoveElementReSolSolution sol = new RemoveElementReSolSolution();
		
		sol.removeElement(nums, val);
	}
	
}
