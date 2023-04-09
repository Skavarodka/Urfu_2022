package lr12;

//7.	Напишите функцию, которая принимает на вход список строк и возвращает новый список,
// содержащий только те строки, которые имеют длину больше заданного значения.

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex7 {
    public static void main(String[] args) {
        String string = "Напишите функцию, которая принимает на вход список строк и возвращает новый список, " +
                "содержащий только те строки, которые имеют длину больше заданного значения..";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\n" + "Строка после сплитования : " + "\n");
        for (String e : strings) {
            System.out.println(e);
        }
        System.out.println("Введите размер строки");
        Scanner in = new Scanner(System.in);
        List<String> stringsAfter = funcString(strings, in.nextInt());

        System.out.println("\n" + "Строка после преобразования : " + "\n");
        for (String e : stringsAfter) {
            System.out.println(e);
        }
    }
    public static List<String> funcString(List<String> strings, Integer str) {
        return strings.stream().filter(a -> (a.length() > str) ).collect(Collectors.toList());
    }
}
