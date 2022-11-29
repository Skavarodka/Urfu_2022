package LR2;
import java.util.Scanner;
public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int num = in.nextInt();
        int answer = num % 10000;
        for ( int i = 0; i < 4; i++) {
            int num1 = num % 10;

            System.out.println(num1);

        }
    }
}
