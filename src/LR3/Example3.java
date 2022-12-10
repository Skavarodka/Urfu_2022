package LR3;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int num = in.nextInt();
        int[] fibonachi = new int[num];
        fibonachi[0] = 1;
        fibonachi[1] = 1;
        for (int i = 2 ; i < num ; ++i) {
            fibonachi[i] = fibonachi[i - 1] + fibonachi[i - 2];

        }
        for (int i = 0; i < num; ++i) {
            System.out.println(fibonachi[i]);
        }
    }
}
