package LR2;
import java.util.Scanner;
public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int num = in.nextInt();
        int answer = num % 3;
        if ( answer == 0 ){
            System.out.println("Ваше число делиться на 3");
        } else {
            System.out.println("Ваше число не делиться на 3");
        }

    }
}
