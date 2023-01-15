package LR7.example1;

public class SubClass extends SuperClassTest {
    private String str2;
    private String str3;
    SubClass(String string1) {
       super(string1);
    }
    SubClass(String str2, String str3) {
        this.str2 = str2;
        this.str3 = str3;
    }
    @Override
    public String toString() {
        String ClassNameAndValue;
        ClassNameAndValue = "sub" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " str1 = " + this.getStr1() + "\n" +
                " str2 = " + this.str2 + "\n" +
                " str3 = " + this.str3;
        return ClassNameAndValue;
    }
    public String getStr2() {
        return str2;
    }
    public void setStr2(String str2) {
        this.str2 = str2;
    }
    public String getStr3() {
        return str3;
    }
    public void setStr3(String str3) {
        this.str3 = str3;
    }
}
