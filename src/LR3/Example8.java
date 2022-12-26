package LR3;

public class Example8 {
    public static void main(String[] args) {

        char[] array = new char[10];
        char letters = 'A';
        for ( int i = 0; i < array.length  ; letters++) {
            array[i] = letters;
            i++;
            if (i == 10) {
                break;
            }
            if ( letters == 65 || letters == 69 || letters == 73 ) {
                i--;
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(array[i]);
        }
    }
}
