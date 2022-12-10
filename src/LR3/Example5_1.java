package LR3;

import java.util.Random;
import java.util.Scanner;

public class Example5_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int num = in.nextInt();
        int sum = 0;
        Random random = new Random();
        while (num > 0) {
            int i = random.nextInt(100);
            if (i % 5 == 2 || i % 3 == 1) {
                System.out.println(i);
                sum = sum + i;
                num--;
            }
        }
        System.out.println(sum);
    }
}
