package LR1;
import java.util.Scanner;
public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваш год рождения");
        int byear = 2022 - in.nextInt();
        System.out.println("Вам " + byear + " лет" );
    }
}
