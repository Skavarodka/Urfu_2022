package LR7.example4;

public class SuperClass {
    public char charFieldEx4;
    SuperClass(char chr1) {
        this.charFieldEx4 = chr1;
    }

    SuperClass(SuperClass supObject) {
        this.charFieldEx4 = supObject.charFieldEx4;
    }

    String showObject(SuperClass obj) {
        String show;
        show = "SupeClass " + "\n" + obj.charFieldEx4;
        return show;
    }
}
