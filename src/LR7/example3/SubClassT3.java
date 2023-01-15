package LR7.example3;

public class SubClassT3 extends SuperClassT3{
    public char openCharField;

    SubClassT3(int int1, char char1) {
        super(int1);
        this.openCharField = char1;
    }

    void setOpenIntField(int int1, char char1) {
        this.openIntField = int1;
        this.openCharField = char1;
    }
    @Override
    public String toString() {
        String tempString;
        tempString = this.getClass().getSimpleName() + "\n" + this.openIntField + "\n" +
        this.openCharField;
        return tempString;
    }
}
