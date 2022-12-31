import java.util.Arrays;
import java.util.Random;

public class tes7 {
    public static void main(String[] args) {
        int d = 0;
        Random rnd = new Random();
        int a = rnd.nextInt(10);
        int b = rnd.nextInt(10);
        int k = 0;
        int[][] nums = new int[a][b];
        int n = a;
        int m = b;
        int v = n;
        for (int i = 0 ; i < n ; i++) {
            for ( int j = 0 ; j < n - d ; j++) {
                nums[i][j] = k ;
                k++;
            }
            d++;
            v--;
            for ( int j = n - 1 ; j >= d; j--) {
                nums[j][v] =k;
                k++;
            }
        }
        System.out.println(Arrays.deepToString(nums));
    }
}
