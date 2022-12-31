package LR6.Example5;

public class Example5 {
    public static double squareMethod(double num) {
        int sum = 0;
        for (int i = 1 ; i <= num ; i++) {
            sum += i * i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(squareMethod(33));
    }
}
