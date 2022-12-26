package LR5.task4;

public class Example4 {
    int int1;
    char char1;
    Example4(char charArg, int intArg) {
        char1 = charArg;
        int1 = intArg;
    }
    Example4(double doubleArg) {
        char1 = (char)doubleArg;
        int a = (int)doubleArg;
        double d = (doubleArg - a) * 100;
        int1 = (int) d;
    }

}
