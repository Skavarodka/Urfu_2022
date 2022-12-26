package LR5.task3;

public class Example3 {
    int num1;
    int num2;
    Example3() {
        System.out.println("Конструктор без аргументов");
        num1 = 5;
        num2 = 3;
    }
    Example3(int numbers) {
        System.out.println("Конструктор с одним аргументом");
        num1 = numbers;
        num2 = 3;
    }
    Example3(int numbers1, int numbers2) {
        System.out.println("Конструктор с двумя аргументами");
        num1 = numbers1;
        num2 = numbers2;
    }
    int count() {
        return num1 + num2;
    }
}
