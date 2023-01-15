package LR7.example2;

public class SUbClass extends SuperClass{
    public int openIntField;

    SUbClass(int intF, String stringF) {
        super(stringF);
        this.openIntField = intF;
    }

    @Override
    void setString() {
        System.out.println("Переопределенный метод субкласса без параметров");
    }

    @Override
    void setString(String str1) {
        super.setString(str1);
    }

    void setString(int intF) {
        this.openIntField = intF;
    }

    void setString(String stringF, int intF) {
        super.setString(stringF);
        this.openIntField = intF;
    }

    public int getOpenIntField() {
        return openIntField;
    }
}
