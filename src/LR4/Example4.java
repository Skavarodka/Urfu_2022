package LR4;

public class Example4 {
    public static void main(String[] args) {

        int[][] array = new int[3][];

        for (int i = 0 ; i < array.length ; i++) {
            array[i] = new int [i + 1] ;
        }
        for ( int i = 0 ; i < array.length ; i++ ) {
            for (int j = 0 ; j < i + 1 ; j++) {
                array[i][j] = 2;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
