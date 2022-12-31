package LR6.Example1;

public class Example1 {
    public static void main(String[] args) {
        Try1 try1 = new Try1();
        try1.setField('A');
        try1.setField("Hello World!");
        char[] arrayChar = new char[] {'B'};
        try1.setField(arrayChar);
        char[] arrayChar2 = new char[] {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd', '!' };
        try1.setField(arrayChar2);
    }
}
