package LR9;

//определить экспериментально, ошибки каких классов будут сгенерированы;
//создать обработчики исключительных ситуаций с использованием выявленных классов и
//всех секций конструкции обработчика с соответствующими сообщениями,позволяющими корректно выполнить программу.

//В программе, вычисляющей среднее значение среди положительных элементов одномерного массива (тип элементов int),
//вводимого с клавиатуры, могут возникать ошибки в следующих случаях:
//        –	ввод строки вместо числа; InputMismatchException NoSuchElementException RuntimeException
//        –	несоответствие числового типа данных; InputMismatchException NoSuchElementException RuntimeException
//        –	положительные элементы отсутствуют. ArithmeticException RuntimeException


import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2_1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int arLength = in.nextInt();
        int[] arInt = new int[arLength];
        int temp = 0;
        System.out.println("Введите элементы массива");

        try
        {
            for (int i = 0; i < arInt.length; i++)
            {
                int j = in.nextInt();
                arInt[i] = j;

                if (j > 0)
                {
                    temp += arInt[i];
                }
            }
        }
        catch (InputMismatchException e)
        {
            System.out.println(e);
        }

        try
        {
            if (temp <= 0)
            {
                throw new ArithmeticException("Отсутсвуют положительные элементы");
            }
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("переход");
        temp /= arInt.length;
        System.out.println(Arrays.toString(arInt));
        System.out.println(temp);

    }
}