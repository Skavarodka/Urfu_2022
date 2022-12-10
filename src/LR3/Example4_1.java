package LR3;

import java.util.Scanner;

public class Example4_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два числа");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        if (num1 > num2) {
            int i = num2;
            while ( i <= num1) {
                System.out.println(i);
                ++i;
            }
        } else {
            int j = num1;
            while ( j <= num2 ) {
                System.out.println(j);
                ++j;
            }
        }
    }
}
