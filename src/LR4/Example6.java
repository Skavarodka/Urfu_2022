package LR4;

import java.util.Arrays;
import java.util.Random;

public class Example6 {
    public static void main(String[] args) {
        int[][] arrayOrig = new int[3][5];
        Random rnd = new Random();
        for (int i = 0 ; i < arrayOrig.length ; i++) {

            for (int j = 0 ; j < arrayOrig[i].length ; j++) {
                arrayOrig[i][j] = rnd.nextInt(10);
            }
        }
        int arrayM = rnd.nextInt(0 ,3);
        int arrayN = rnd.nextInt( 0, 5);
        System.out.println(Arrays.deepToString(arrayOrig));
        System.out.println(arrayM + " " + arrayN);
        int[][] arrayDel = new int[2][4];
        for ( int i = 0 ; i < 2 ; i++) {
            for ( int j = 0 ; j < 4 ; j++) {
                arrayDel[i][j] = arrayOrig[i + (i < arrayM ? 0 : 1)][j + (j < arrayN ? 0 : 1)];
            }
        }
        System.out.println(Arrays.deepToString(arrayDel));
    }
}