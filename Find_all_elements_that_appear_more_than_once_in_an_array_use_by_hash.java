package Programs;

import java.util.HashMap;

public class Find_all_elements_that_appear_more_than_once_in_an_array_use_by_hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> fe =new HashMap<>();
		int c=0;
		String arr[]= {"j","a","y","a","k","r","i","s","h","n","a","n"};
		
		for(int i =0;i<=arr.length-1;i++) {
			fe.put(arr[i], fe.getOrDefault(arr[i],0)+1);
		}
		
		//System.out.println("ja "+fe);
		//System.out.println("ja "+fe.values());
		
	   for(String key : fe.keySet()) {
		  // System.out.println(key);
		   int val = fe.get(key);		  
		  // System.out.println(val);
		   if(val>1) {
			   System.out.println("Most Appeared Letter :"+key+"  It's :"+val+" Times Appeared");
		   }
	   }

	
	}

}
