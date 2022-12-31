package LR6.Example4;

public class Example4 {
    public static int doubleFactorial(int num) {
        int sum = 1;
        for (int i = num ; i >= 2 ; i -= 2) {
            sum *= i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(doubleFactorial(10));
    }
}
