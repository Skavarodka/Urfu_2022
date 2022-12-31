package LR6.Example3;

public class Example3 {
    public static int intMax(int[] maxNum) {
        int max = maxNum[0];
        for (int i : maxNum) {
        max = Math.max(max, i);
        }
        return max;
    }
    public static int intMin(int[] minNum) {
        int min = minNum[0];
        for (int i : minNum) {
            min = Math.min(min, i);
        }
        return min;
    }
    public static double intAverage(int[] averageNum) {
        int sum = 0;
        for (int i : averageNum) {
            sum += i;
        }
        return (double) sum / averageNum.length;
    }
    public static void main(String[] args) {
        int[] arrayTest = new int[] { 6, 8, 3, 5, 1, 9 };
        System.out.println(intMax(arrayTest));
        System.out.println(intMin(arrayTest));
        System.out.println(intAverage(arrayTest));
    }
}
