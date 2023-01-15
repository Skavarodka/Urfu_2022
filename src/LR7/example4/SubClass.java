package LR7.example4;

public class SubClass extends SuperClass{
    public String stringFieldEx4;

    SubClass(char chr1, String str1) {
        super(chr1);
        this.stringFieldEx4 = str1;
    }

    SubClass(SubClass subObject) {
        super(subObject);
        this.stringFieldEx4 = subObject.stringFieldEx4;
    }

    String showObject(SubClass obj) {
        String show;
        show = "SubClass" + "\n" + obj.charFieldEx4 + " " + obj.stringFieldEx4;
        return show;
    }
}
