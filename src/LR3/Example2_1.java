package LR3;

import java.util.Scanner;

public class Example2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название дня недели с большой буквы");
        String num = in.nextLine();
        if (num.equals("Понедельник")) {
            System.out.println("Понедельник");
        } else if (num.equals("Вторник")) {
            System.out.println("Вторник");
        } else if (num.equals("Среда")) {
            System.out.println("Среда");
        } else if (num.equals("Четверг")) {
            System.out.println("Четверг");
        } else if (num.equals("Пятница")) {
            System.out.println("Пятница");
        } else if (num.equals("Суббота")) {
            System.out.println("Суббота");
        } else if (num.equals("Воскресенье")) {
            System.out.println("Воскресенье");
        } else {
            System.out.println("Введено некоректное значение или такого дня нет");
        }
    }
}
