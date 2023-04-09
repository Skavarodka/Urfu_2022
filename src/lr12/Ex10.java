package lr12;

//10.	Напишите функцию, которая принимает на вход список целых чисел и возвращает новый список,
// содержащий только те числа, которые меньше заданного значения.

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        Random random = new Random();
        for (int i = 5; i > 0; i--) {
            integerList.add(random.nextInt(10));
        }
        System.out.println(integerList);
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        List<Integer> integerListFunc = funInt(integerList, in.nextInt());
        System.out.println(integerListFunc);
    }
    public static List<Integer> funInt(List<Integer> inList, Integer integer) {
        return inList.stream().filter(x -> (x < integer)).toList();
    }
}