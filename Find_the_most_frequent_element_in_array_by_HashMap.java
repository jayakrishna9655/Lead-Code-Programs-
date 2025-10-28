package Programs;

import java.util.HashMap;


public class Find_the_most_frequent_element_in_array_by_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> frs = new HashMap<>();
	
		 String[] arr= {"jai","jai","jk"};
		 
		for(int i =0;i<arr.length;i++) {
			frs.put(arr[i], frs.getOrDefault(arr[i],0)+1);
		}
				
		System.out.println(frs);
	}

}
