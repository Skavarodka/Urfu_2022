package LR3;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ведите число");
        int num = in.nextInt();
        if (num > 0) {
            int[] array = new int[num];
            int i = 0, j = 0;
            while (j < num) {
                if (i % 5 == 2) {
                    array[j] = i;
                    System.out.println(array[j]);
                    j++;
                }
                i++;
            }
        } else {
            System.out.println("Введено некоректное значение");
        }

    }
}
