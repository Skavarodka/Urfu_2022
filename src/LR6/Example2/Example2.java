package LR6.Example2;
public class Example2 {
    public static class Try2 {
        private static int intField;

        static void fieldRaise() {
            System.out.println(intField++);
        }
        public static void main(String[] args) {
            Try2 try2 = new Try2();
            try2.fieldRaise();
            try2.fieldRaise();
            try2.fieldRaise();
        }
    }
}
