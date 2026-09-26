package Programs;

class SolutionShuffle {
    public int[] shuffle(int[] nums, int n) {
    	
    	int[] tem = new int[nums.length];
    	for(int i =0;i<n;i++) {
    		tem[2*i]=nums[i];
    		tem[2*i+1] = nums[n+i];
    	}
    	for(int i:tem) {
    		System.out.print(i);
    	}
    	
		return tem;
    }
}

public class ShuffleTheArray {
	
	public static void main(String[] args) {
		
			int[] nums = {1,2,3,1,2,3};
			//1,1,2,2,3,3
			int n = 3;
		
			SolutionShuffle sol = new SolutionShuffle();
			sol.shuffle(nums, n);
	}

}
