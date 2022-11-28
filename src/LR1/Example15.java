package LR1;
import java.util.Scanner;
public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два числа");
        int num = in.nextInt();
        int num2 = in.nextInt();
        int num3 = num + num2, num4 = num - num2;
        System.out.println("Сумма чисел " + num3 + " Разность чисел " + num4);
    }
}