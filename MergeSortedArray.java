package Programs;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3, n = 3;
        int[] nums2 = {2,5,6};

        for (int i = 0; i < m; i++) {
            nums1[m + i] = nums2[i];
        }

        Arrays.sort(nums1);

        System.out.println(Arrays.toString(nums1));
    }
}
