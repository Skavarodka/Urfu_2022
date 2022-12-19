package LR4;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст для шифрования");
        String text = in.nextLine();
        System.out.println("Введите ключ для шифрования");
        int key = in.nextInt();
        String caeserOn = encrypt(text, key);
        System.out.println("Текст после преобразования: " + caeserOn);
        System.out.println("Выполнить обратное преобразование? (y/n)");
        boolean count = true;
        while (count) {
            String answer = in.next();
            if (answer.equals("y")) {
                System.out.println(encryptOff(caeserOn, key));
                count = false;
            } else if (answer.equals("n")) {
                System.out.println("До свидания!");
                count = false;
            }
            else {
                System.out.println("Введите корректный ответ");
            }
        }
    }
    public static String encrypt(String encryptString, int shift) {
        char[] arrayChar = encryptString.toCharArray();
        long[] arrayLong = new long[arrayChar.length];
        char[] newArrayChar = new char[arrayChar.length];
        for (int i = 0 ; i < arrayChar.length ; i++) {
            arrayLong[i] = arrayChar[i] + shift;
            newArrayChar[i] = (char) arrayLong[i];
        }
        encryptString = new String(newArrayChar);
        return  encryptString;
    }
    public static String encryptOff(String encryptString, int shift) {
        char[] arrayChar = encryptString.toCharArray();
        long[] arrayLong = new long[arrayChar.length];
        char[] newArrayChar = new char[arrayChar.length];
        for (int i = 0 ; i < arrayChar.length ; i++) {
            arrayLong[i] = arrayChar[i] - shift;
            newArrayChar[i] = (char) arrayLong[i];
        }
        encryptString = new String(newArrayChar);
        return  encryptString;
    }
}
