package Programs;

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 3};
        int[] nums2 = {8, 2, 3, 9};

        int[] tem = new int[Math.min(nums1.length, nums2.length)];
        int k = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {

                if (nums1[i] == nums2[j]) {
                    boolean exists = false;
                    for (int x = 0; x < k; x++) {
                        if (tem[x] == nums1[i]) {
                            exists = true;
                            break;
                        }
                    }

                    if (!exists) {
                        tem[k] = nums1[i];
                        k++;
                    }
                }
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.println(tem[i]);
        }
    }
}
