package LR1;
import java.util.Scanner;
public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваш возраст");
        int byear = 2022 - in.nextInt();
        System.out.println("Вы родились в " + byear + " году" );
    }
}