package LR1;
import java.util.Scanner;
public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int num = in.nextInt();
        int num2 = num + 1, num3 = num - 1, num5 = num + num2 + num3, num4 = num5 * num5;
        System.out.println(num + " " + num2 + " " + num3 + " " + num4);
    }
}
