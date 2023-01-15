package LR7.example3;

public class Main {
    public static void main(String[] args) {

        SuperClassT3 superClassObject = new SuperClassT3(1);

        SubClassT3 subClassObject = new SubClassT3(11, 'A');

        SubClassT3Number2 subClassNumber2Object = new SubClassT3Number2(111, 'B', "вызов через конструктор");

        System.out.println(superClassObject.toString() + "\n" + subClassObject.toString() + "\n" +
                subClassNumber2Object.toString());

        superClassObject.setOpenIntField(2);
        subClassObject.setOpenIntField(22,'a');
        subClassNumber2Object.setOpenIntField(222, 'b', "вызов через метод");

        System.out.println(superClassObject.toString() + " " + subClassObject.toString() + " " +
                subClassNumber2Object.toString());
    }
}
