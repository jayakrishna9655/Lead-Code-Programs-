package Programs;

import java.util.Arrays;
import java.util.List;

import java.util.*;

class KSumSolution {

    public List<List<Integer>> solution(int[] nums, int k, int target) {
        Arrays.sort(nums);
        return kSum(nums, k, target, 0);
    }

    private List<List<Integer>> kSum(int[] nums, int k, int target, int start) {
        List<List<Integer>> res = new ArrayList<>();

        if (k == 2) {
            int left = start;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[left] + nums[right];

                if (sum == target) {
                    res.add(Arrays.asList(nums[left], nums[right]));

                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
            return res;
        }

        
        for (int i = start; i < nums.length - k + 1; i++) {

            if (i > start && nums[i] == nums[i - 1]) continue;

            List<List<Integer>> sub = kSum(nums, k - 1, target - nums[i], i + 1);

            for (List<Integer> list : sub) {
                List<Integer> temp = new ArrayList<>();
                temp.add(nums[i]);
                temp.addAll(list);
                res.add(temp);
            }
        }

        return res;
    }
}

public class ksum {

	public static void main(String[] args) {
		
		KSumSolution sol=new KSumSolution();
		int[] data= {-2,0,-1,1,2};
		int k=2;
		int t=1;
		sol.solution(data, k, t);
		System.out.println(sol.solution(data, k, t));
		
	}
	
}
