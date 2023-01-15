package LR7.example3;

public class SuperClassT3 {
    public int openIntField;
    SuperClassT3(int int1) {
        this.openIntField = int1;
    }
    void setOpenIntField(int int1) {
        this.openIntField = int1;
    }
    @Override
    public String toString() {
        String tempString;
        tempString = this.getClass().getSimpleName() + "\n" + this.openIntField;
        return tempString;
    }
}
