package Programs;

public class TwoSumproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,2,4};
		int target = 6;
		
		for(int i=0 ; i < nums.length -1 ; i++) {
			for(int j=i +1 ; j<nums.length;j++) {
				if(nums[i] + nums[j] == target) {
					System.out.println(nums[i] + " " + nums[j]);
				}
			}
		}
	}

}
