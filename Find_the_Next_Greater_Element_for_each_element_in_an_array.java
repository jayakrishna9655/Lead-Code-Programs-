package Programs;

public class Find_the_Next_Greater_Element_for_each_element_in_an_array {

    public static void main(String[] args) {
        int[] k = {2,1,3};
        
        for (int i = 0; i < k.length; i++) {
            int nextGreater = -1; // default if no greater element found
            
            // check elements to the right of k[i]
            for (int j = i + 1; j < k.length; j++) {
                if (k[j] > k[i]) {
                    nextGreater = k[j];
                    break; // stop when first greater element found
                }
            }
            
            System.out.println(nextGreater + " ");
        }
    }
}
