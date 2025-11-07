package Programs;

import java.util.HashSet;

public class RemoveDuplicatesFromAnArrayUsingHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str= {"j","a","y","a"};
		HashSet<String> set = new HashSet<>();
		for(String v : str) {
			set.add(v);
		}

		System.out.println(set);
		
	}

}
