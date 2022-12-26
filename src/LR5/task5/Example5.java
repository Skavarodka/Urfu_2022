package LR5.task5;

public class Example5 {
    private int int1;
    public void getInt1(int a) {
        this.int1 = a;
        if (a >= 100) {
            this.int1 = 100;
        }
    }
    public void getInt1() {
        int1 = 0;
    }
    Example5() {
        int1 = 0;
    }
    Example5(int b) {
        if (b >= 100) {
            int1 = 100;
        }
    }
    int count() {
        return int1;
    }
}
