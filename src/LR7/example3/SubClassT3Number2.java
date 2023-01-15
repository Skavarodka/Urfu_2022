package LR7.example3;

public class SubClassT3Number2 extends SubClassT3{
    String openStringField;
    SubClassT3Number2(int int1, char char1, String str1) {
        super(int1, char1);
        this.openStringField = str1;
    }
    void setOpenIntField(int int1, char char1, String str1) {
        this.openIntField = int1;
        this.openCharField = char1;
        this.openStringField = str1;
    }
    @Override
    public String toString() {
        String tempString;
        tempString = this.getClass().getSimpleName() + "\n" + this.openIntField + "\n" +
                this.openCharField + "\n" + this.openStringField;
        return tempString;
    }
}
