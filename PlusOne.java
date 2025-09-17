package Programs;

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        int[] d = {9,9,9,9,9,9,9};  // Input digits

        for (int i = d.length - 1; i >= 0; i--) {
            if (d[i] < 9) {       // If digit < 9, just add 1 and done
                d[i]++;
                System.out.println(Arrays.toString(d));
                return;
            }
            d[i] = 0;             // If digit = 9, make it 0 and carry over
        }

        // If all were 9 (like 999 → 1000)
        int[] newD = new int[d.length + 1];
        newD[0] = 1;
        System.out.println(Arrays.toString(newD));
    }
}
