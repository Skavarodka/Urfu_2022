package LR5.task5;

public class Main {
    public static void main(String[] args) {
        Example5 example5 = new Example5();
        example5.getInt1(14);
        System.out.println(example5.count());
        example5.getInt1();
        System.out.println(example5.count());
        Example5 example51 = new Example5();
        System.out.println(example51.count());
        Example5 example52 = new Example5(122);
        System.out.println(example52.count());
    }
}
