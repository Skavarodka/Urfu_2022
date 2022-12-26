package LR5.task2;

public class Example2 {
    public char charMax;
    public char charMin;

    public void setChar(char charMax, char charMin) {
        this.charMax = charMax;
        this.charMin = charMin;
    }

    public void showChar() {
        int max = charMax;
        int min = charMin;
        if (charMin > charMax) {
            max = charMin;
            min = charMax;
        }
        for (int i = min ; i <= max ; i++) {
            System.out.println((char) i);
        }
    }
}
