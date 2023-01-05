package LR6.Example8;

public class Example8 {
    public static void main(String[] args) {
        int[] testAr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(averageInt(testAr));
    }
    public static int averageInt(int[] numAver) {
        int sum = 0;
        for (int i : numAver) {
            sum += i;
        }
        return sum / numAver.length;
    }
}
