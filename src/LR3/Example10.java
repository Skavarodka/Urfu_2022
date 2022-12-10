package LR3;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = in.nextInt();
        System.out.println("Размер введенного массива равен " + size);
        int[] num = new int [size];
        Random random = new Random();
        for (int i = 0 ; i < num.length ; i++) {
            num[i] = random.nextInt(200);
            System.out.println("Элемент массива ["+i+"] = " + num[i]);
        }
        Arrays.sort(num);
        int n = num.length;
        int temp;
        for (int i = 0; i < n/2; i++) {
            temp = num[n-i-1];
            num[n-i-1] = num[i];
            num[i] = temp;
        }
        System.out.println("Произведена сортировка массива");
        for (int i = 0 ; i < num.length ; i++) {
            System.out.println("Элемент массива ["+i+"] после сортировки = " + num[i]);
        }

    }
}
