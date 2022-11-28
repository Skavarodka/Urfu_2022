package LR1;
import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите вашу фамилию");
        String fname = in.nextLine();
        System.out.println("Введите ваше имя");
        String name = in.nextLine();
        System.out.println("Введите ваше отчество");
        String oname = in.nextLine();
        System.out.println("Привет " + fname + ", " + name + ", " + oname );
    }
}
