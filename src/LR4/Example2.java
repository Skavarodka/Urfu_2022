package LR4;

public class Example2 {
    public static void main(String[] args) {
        int figure = 3;
        int z = 0;
        for (int i = 1 ; i <= figure ; i++) {
            System.out.print( " " + i + " ");
            for (int j = 0 ; j <= z ; j++) {
                System.out.print("* ");
            }
            z++;
            System.out.println(z);
        }

    }
}
