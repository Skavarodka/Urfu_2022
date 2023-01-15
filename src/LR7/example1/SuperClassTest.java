package LR7.example1;

public class SuperClassTest {
    private String str1;
    SuperClassTest(String string1) {
        this.str1 = string1;
    }
    SuperClassTest() {
    }
    @Override
    public String toString() {
        String superClassNameAndValue;
        superClassNameAndValue = "super" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " string1  = " + this.getStr1();
        return superClassNameAndValue;
    }
    public String getStr1() {
        return str1;
    }
    public void setStr1(String str1) {
        this.str1 = str1;
    }
}
