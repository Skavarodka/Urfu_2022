package LR2;
import java.util.Scanner;
public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int num = in.nextInt();
        int num1 = num / 10;
        int num2 = num1 / 10;
        int num3 = num2 / 10;
        int answer = num3 % 10;



        System.out.println("В вашем числе такое количество тысяч " + answer + " (определяется четвертая цифра справа в десятичном представлении числа)");

        }
    }

