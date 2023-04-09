package lr12;

//4.Напишите функцию, которая принимает на вход список чисел и возвращает новый список, содержащий квадраты этих чисел.

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ex4 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        Random random = new Random();
        for (int i = 5 ; i > 0 ; i--) {
            integerList.add(random.nextInt(10));
        }
        System.out.println(integerList);

        List<Integer> integerListFunc = funInt(integerList);
        System.out.println(integerListFunc);
    }
    public static List<Integer> funInt(List<Integer> inList) {
        return inList.stream().map(x -> (x * x)).toList();
    }
}
