package LR7.example2;

public class Main {
    public static void main(String[] args) {
        SuperClass superObject = new SuperClass("я из конструктора суперкласса");
        SUbClass sUbObject = new SUbClass(2, "я из конструктора субкласса");
        System.out.println(superObject.getStringEx2() + "\n" + sUbObject.getStringEx2() +
                "\n" + sUbObject.getOpenIntField());

        superObject.setString(); //метод без параметров суперкласса
        superObject.setString("метод суперкласса с одним параметром"); // метод суперкласса с одним параметром
        sUbObject.setString();
        sUbObject.setString(22);
        sUbObject.setString("переопределенный метод из суб класса");
        System.out.println(superObject.getStringEx2() + "\n" + sUbObject.getOpenIntField() +
                "\n" + sUbObject.getStringEx2());
        sUbObject.setString("метод со строкой и числом субкласса", 222);
        System.out.println(sUbObject.getOpenIntField() +
                "\n" + sUbObject.getStringEx2() + "\n" + superObject.getStringLength() + " метод возвращающий длину строки суперкласса");

    }
}
