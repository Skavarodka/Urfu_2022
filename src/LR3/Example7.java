package LR3;

public class Example7 {
    public static void main(String[] args) {
        System.out.println("Начало");
        int num = 10;
        char[] array = new char[num];

        //char letters = 122;
        char lettersStart = 'a';

        for (int i = 0; i < num; lettersStart++) {
            if (lettersStart % 2 == 1 ) {
                array[i] = lettersStart;
                //System.out.println(array[i]);
                i++;
            }

        }
        System.out.println("Прямой порядок");
        for (int i = 0; i < num; i++) {
            System.out.println(array[i]);
        }
        System.out.println("Обратный порядок");
        for (int i = 9; 0 <= i; i--) {
            System.out.println(array[i]);
        }

    }
}
