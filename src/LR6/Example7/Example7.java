package LR6.Example7;

import java.util.Arrays;

public class Example7 {
    public static int[] charToInt(char[] testAr) {
        int[] arrayInt = new int[testAr.length];
        for (int i = 0 ; i < testAr.length ; i++) {
            arrayInt[i] = testAr[i];
        }
        return arrayInt;
    }

    public static void main(String[] args) {
        char[] arrayChar = new char[] {'H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd', '!' };
        System.out.println(Arrays.toString(charToInt(arrayChar)));
    }
}
