package LR6.Example6;

import java.util.Arrays;


public class Example6 {
    public static int[] intAr(int[] ar, int ai) {
        int[] newIntAr;
        if (ai > ar.length) {
            newIntAr = new int[ar.length];
            System.arraycopy(ar, 0, newIntAr, 0, ar.length);
        } else {
            newIntAr = new int[ai];
            System.arraycopy(ar, 0, newIntAr, 0, ai);
        }
        return newIntAr;
    }

    public static void main(String[] args) {
        int[] test = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] test1;
        int testInt = 3;
        test1 = intAr(test, testInt);
        System.out.println(Arrays.toString(test1));
        test1 = intAr(test, 11);
        System.out.println(Arrays.toString(test1));
    }
}
