package LR3;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int num = in.nextInt();
        int sum = 0;
        for (int i = 0; num > 0; i++) {
            if (i % 5 == 2 || i % 3 == 1) {
                System.out.println(i);
                sum = sum + i;
                num--;
            }
        }
        System.out.println(sum);
    }
}
