package lr12;

//9.	Напишите функцию, которая принимает на вход список строк и возвращает новый список,
// содержащий только те строки, которые содержат только буквы (без цифр и символов).

import java.util.List;
import java.util.stream.Collectors;

public class Ex9 {
    public static void main(String[] args) {
        String string = "//9.Напишите функцию, которая принимает на вход список строк и возвращает новый список," +
                "// содержащий только те строки, которые содержат только буквы (без цифр и символов).";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\n" + "Строка после сплитования : " + "\n");
        for (String e : strings) {
            System.out.println(e);
        }
        List<String> stringsAfter = funcString(strings);

        System.out.println("\n" + "Строка после преобразования : " + "\n");
        for (String e : stringsAfter) {
            System.out.println(e);
        }
    }
    public static List<String> funcString(List<String> strings) {
        return strings.stream().filter(a -> a.matches("\\p{L}+") ).collect(Collectors.toList());
    }
}