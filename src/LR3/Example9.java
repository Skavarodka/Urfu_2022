package LR3;

import java.util.Random;

public class Example9 {
    public static void main(String[] args) {
        int[] num = new int[10];
        Random random = new Random();
        for (int i = 0 ; i < num.length ; i++) {
            num[i] = random.nextInt(50);
            System.out.println(num[i]);
        }
        int minNum = num[0];
        for (int i = 0 ; i < num.length ; i++) {
            if ( num[i] < minNum ) {
                minNum = num[i];
            }
        }
        for (int i = 0 ; i < num.length ; i++) {
            if (num[i] == minNum) {
                System.out.println("Элемент массива с минимальным значением ["+i+"] = " + num[i]);
            }
        }
    }
}
