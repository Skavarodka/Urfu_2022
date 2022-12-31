package LR6.Example1;



public class Try1 {
    char charField;
    String stringField;
    public void setField (char char1) {
        this.charField = char1;
        System.out.println(charField);
    }
    public void setField (String string1) {
        this.stringField = string1;
        System.out.println(stringField);
    }
    public void setField (char[] charAr) {
        if (charAr.length < 2) {
            this.charField = charAr[0];
            System.out.println(charField);
        } else {
            stringField = new String(charAr);
            System.out.println(stringField);
        }
    }
}
