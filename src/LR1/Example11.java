package LR1;
import java.util.Scanner;
public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String name = in.nextLine();
        System.out.println("Введите ваш год рождения");
        int byear = 2022 - in.nextInt();
        System.out.println(name + " вам " + byear + " лет" );
    }
}