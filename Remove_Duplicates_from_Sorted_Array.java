package Programs;

public class Remove_Duplicates_from_Sorted_Array {

    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,5,4,4};
        int k = 1;                 
        int tem = nums[0];         

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != tem) { 
                tem = nums[i];     
                nums[k] = tem;     
                k++;               
            }
        }


        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + (i < k - 1 ? ", " : ""));
        }
       
    }
}
