package LR5.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два символа");
        char setMax = in.next().charAt(0);
        char setMin = in.next().charAt(0);
        Example2 example2 = new Example2();
        example2.setChar(setMax, setMin);
        example2.showChar();
    }
}
