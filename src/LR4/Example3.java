package LR4;



public class Example3 {
    public static void main(String[] args) {
        int[][] arrayTwo = new int[3][4];
        for ( int i = 0 ; i < arrayTwo.length ; i++ ) {
            for (int j = 0 ; j < arrayTwo[i].length ; j++) {
                arrayTwo[i][j] = 2;
                System.out.print(arrayTwo[i][j] + " ");
            }
            System.out.println();
        }
    }
}
