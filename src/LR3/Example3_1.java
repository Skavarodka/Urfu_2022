package LR3;

import java.util.Scanner;

public class Example3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int num = in.nextInt();
        int[] fibonachi = new int[num];
        fibonachi[0] = 1;
        fibonachi[1] = 1;
        int i = 2;
        while (i < num) {
            fibonachi[i] = fibonachi[i - 1] + fibonachi[i - 2];
            ++i;
        }
        int j = 0;
        while (j < num) {
            System.out.println(fibonachi[j]);
            ++j;
        }


    }
}
