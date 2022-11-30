import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int answer5 = num % 1000;
        int answer7 = num % 10000;
        int answer1 = num / 1000;
        int answer2 = num / 10000;
        System.out.println(answer5 + " " + answer7 + " " + answer1 + " " + answer2);
    }
}