package LR1;
import java.util.Scanner;
public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String name = in.nextLine();
        System.out.println("Введите ваш возраст");
        int year = in.nextInt();
        System.out.println("Ваше имя " + name + " Ваш возраст " + year );
    }
}