package LR2;
import java.util.Scanner;
public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int num = in.nextInt();
        int answer5 = num % 5;
        int answer7 = num % 7;
        if (answer5 == 2 && answer7 == 1) {
            System.out.println("Ваше число делится на 5 с остатком 2 и на 7 с остатком 1");
        } else {
            System.out.println("Ваше число не делится на 5 с остатком 2 и на 7 с остатком 1");
        }
    }
}
