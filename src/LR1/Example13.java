package LR1;
import java.util.Scanner;
public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два числа");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println("Сумма ваших чисел равна " + (num1 + num2));
    }
}
