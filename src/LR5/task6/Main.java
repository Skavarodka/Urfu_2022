package LR5.task6;

public class Main {
    public static void main(String[] args) {
        Example6 example6 = new Example6(12, 22);
        example6.count();
        Example6 example61 = new Example6(22);
        example61.count();
        example6.setNum(13, 33);
        example6.count();
        example61.setNum(33);
        example61.count();
    }
}
