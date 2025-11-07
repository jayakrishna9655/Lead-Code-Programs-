package Programs;

import java.util.HashMap;

public class Count_word_frequency_in_a_sentence {

	public static void main(String[] args) {
		
		String[] str = {"j","a","y","a"};
		
        HashMap<String, Integer>map=new HashMap<>();
        
        for(int i =0;i<str.length;i++) {
        	map.put(str[i],map.getOrDefault(str[i],0)+1);
        	
        }
        
        System.out.println(map);
	}

}
