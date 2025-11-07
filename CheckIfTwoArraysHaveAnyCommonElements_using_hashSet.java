package Programs;

import java.util.HashSet;

public class CheckIfTwoArraysHaveAnyCommonElements_using_hashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    String[] str1 = {"jai","jk","tjk"};
        String[] str2 = {"san","jk","tsk"};
        
        HashSet<String> set = new HashSet<>();
        
        for(String v : str1) {
        	set.add(v);
        }
        for(String v : str2) {
        	if(set.contains(v)) {
        		System.out.println(v +"  yes ,contains the some value");
        	}
        	else {
        		System.out.println("no it not contains the some value");
        	}
        }
		
	}

}
