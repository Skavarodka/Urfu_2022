package LR7.example4;

public class ThirdSubClass extends SubClass{
    public int intFieldEx4;

    ThirdSubClass(char chr1, String str1, int int1) {
        super(chr1, str1);
        intFieldEx4 = int1;
    }

    ThirdSubClass(ThirdSubClass thirdSubObject) {
        super(thirdSubObject);
        this.intFieldEx4 = thirdSubObject.intFieldEx4;
    }

    String showObject(ThirdSubClass obj) {
        String show;
        show = "SubClass" + "\n" + obj.charFieldEx4 + " " + obj.stringFieldEx4 +
                " " + obj.intFieldEx4;
        return show;
    }
}
