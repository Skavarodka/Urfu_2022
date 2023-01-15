package LR7.example1;

public class Main {
    public static void main(String[] args) {
        SuperClassTest superClassObject =
                new SuperClassTest("передал в конструктор суперкласса");
        String className = superClassObject.toString();
        System.out.println(className);

        SubClass subClassObject1 =
                new SubClass("Передал в конструктор субкласса");
        String subClassName = subClassObject1.toString();
        System.out.println(subClassName);

        SubClass subClassObject2 =
                new SubClass("передал в конструктор субкласса", "где два параметра");
        String subClassName2 = subClassObject2.toString();
        System.out.println(subClassName2);
    }
}
