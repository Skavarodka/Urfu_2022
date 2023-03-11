package LR9;

//определить экспериментально, ошибки каких классов будут сгенерированы;
//создать обработчики исключительных ситуаций с использованием выявленных классов и
//всех секций конструкции обработчика с соответствующими сообщениями,позволяющими корректно выполнить программу.

//В программе, вычисляющей сумму элементов типа byte одномерного массива, вводимого с клавиатуры,
// могут возникать ошибки в следующих случаях:
//        –	ввод строки вместо числа; InputMismatchException
//        –	ввод или вычисление значения за границами диапазона типа. InputMismatchException

import java.util.Arrays;
import java.util.Scanner;

public class Ex2_3 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        int z = in.nextInt();
        arS(z);
    }
    static void arS(int x) {
        try {
            byte sum = 0;
            byte[] arB = new byte[x];
            System.out.println("Введите элементы массива");
            for (int i = 0 ; i < arB.length ; i++) {
                byte j = in.nextByte();
                arB[i] = j;
                sum += j;
            }
            System.out.println(Arrays.toString(arB) + sum);
        } catch (RuntimeException e) {
            System.out.println("END " + e);
        } finally {
            System.out.println("Конец программы");
        }
    }
}