package LR6.Example9;

import java.util.Arrays;

public class Example9 {
    public static void main(String[] args) {
        char[] charAr = new char[]{'H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd', '!' };
        System.out.println(Arrays.toString(charRevers(charAr)));
    }
    public static char[] charRevers(char[] testAr) {
        int testI = testAr.length;
        int temp;
        for (int i = 0; i < testI / 2; i++) {
            temp = testAr[testI - i - 1];
            testAr[testI - i - 1] = testAr[i];
            testAr[i] = (char) temp;
        }
        return testAr;
    }
}
