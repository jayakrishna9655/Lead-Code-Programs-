package Programs;

import java.util.HashMap;

public class CheckIfTwoArraysHaveAnyCommonElements {

    public static void main(String[] args) {

        String[] str1 = {"jai","jk","tjk"};
        String[] str2 = {"san","jk","tsk"};

        HashMap<String, Integer> hash = new HashMap<>();
        for(int i = 0; i < str1.length; i++) {
            hash.put(str1[i], hash.getOrDefault(str1[i], 0) + 1);
        }

        HashMap<String, Integer> hash1 = new HashMap<>();
        for(int i = 0; i < str2.length; i++) {
            hash1.put(str2[i], hash1.getOrDefault(str2[i], 0) + 1);
        }

        boolean found = false;

        // Check common elements
        for(String key : hash.keySet()) {
            if(hash1.containsKey(key)){
                System.out.println("Common element found: " + key);
                found = true;
            }
        }

        if(!found) {
            System.out.println("No common elements");
        }

    }

}
