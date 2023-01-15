package LR7.example2;

public class SuperClass {
    private String str1;

    SuperClass(String stringName) {
        this.str1 = stringName;
    }

    void setString() {
        this.str1 = "метод без параметров";
        System.out.println(str1);
    }
    void setString(String str1) {
        this.str1 = str1;
    }

    public int getStringLength() {
        return  str1.length();
    }
    //public int getStringLength() {
    //final int stringLength = str1.length();
    //return  stringLength; }
    public String getStringEx2() {
        return str1;
    }
}
