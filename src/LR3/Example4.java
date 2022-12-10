package LR3;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два числа");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        if (num1 > num2) {
            for (int i = num2; i <= num1; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = num1; i <= num2; i++) {
                System.out.println(i);
            }
        }
    }
}
