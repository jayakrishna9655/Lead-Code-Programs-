package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class SolutiontopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        
      
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {

                map.put(nums[i], map.get(nums[i]) + 1);

            } else {
                map.put(nums[i], 1);
            }

        }

        List<Integer> list = new ArrayList(map.keySet());

        Collections.sort(list, (a, b) -> map.get(b) - map.get(a));

        int[] resAll = new int[k];
        for (int i = 0; i < k; i++) {
            resAll[i] = list.get(i);
            System.out.println(resAll[i]);
        }

        List<String> trackingIds = Arrays.asList("TRK1", "TRK2", "TRK1", "TRK3", "TRK2");
        HashSet<String> set = new HashSet<>(trackingIds);

        return resAll;  

    }
}

public class TopKFrequentElements {
	
	public static void main(String[] args) {
		
		 int[] nums = { 1, 1, 1, 2, 2, 3 };
	        int k = 2;

	        SolutiontopKFrequent sol = new SolutiontopKFrequent();
	        sol.topKFrequent(nums, k);
	}
	
}
