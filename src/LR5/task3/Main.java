package LR5.task3;

public class Main {
    public static void main(String[] args) {
        Example3 example3_1 = new Example3();
        Example3 example3_2 = new Example3(1);
        Example3 example3_3 = new Example3(10, 5);
        System.out.println("Конструктор 1: " + example3_1.count());
        System.out.println("Конструктор 2: " + example3_2.count());
        System.out.println("Конструктор 3: " + example3_3.count());
        System.out.println();
    }
}
