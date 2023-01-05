package LR6.Example10;

import java.util.Arrays;

public class Example10 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(minAndMax(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
    }
    public static int[] minAndMax(int ... num) {
        Arrays.sort(num);
        int[] numArray = new int[2];
        numArray[0] = num[0];
        numArray[1] = num[num.length - 1];
        return numArray;
    }
}
