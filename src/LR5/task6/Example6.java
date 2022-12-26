package LR5.task6;

public class Example6 {
    private int max;
    private int min;
    public void setNum (int num1, int num2) {
        max = Math.max(num1, num2);
        min = Math.min(num1, num2);
    }
    public void setNum (int num) {
        max = Math.max(max, num);
        min = Math.min(min, num);
    }
    Example6(int num1, int num2) {
        max = Math.max(num1, num2);
        min = Math.min(num1, num2);
    }
    Example6(int num) {
        max = Math.max(max, num);
        min = Math.min(min, num);
    }
    void count() {
        System.out.println("Максимум: " + max);
        System.out.println("Минимум: " + min);
    }
}
