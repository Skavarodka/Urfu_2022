package LR1;
import java.util.Scanner;
public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название месяца и количество дней в нем");
        String month = in.nextLine();
        int nday = in.nextInt();
        System.out.println("В месяце " + month + ", " + nday + " дней");
    }
}
