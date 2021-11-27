package Tasks.Classes.LombokEncapsulation;

public class LombokEncapsulation {
    private int number;
    private String stringValue;
    private Object anObject;

    public LombokEncapsulation() {
    }

    public LombokEncapsulation(final int number, final String stringValue, final Object anObject) {
        this.number = number;
        this.stringValue = stringValue;
        this.anObject = anObject;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(final int number) {
        this.number = number;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(final String stringValue) {
        this.stringValue = stringValue;
    }

    public Object getAnObject() {
        return anObject;
    }

    public void setAnObject(final Object anObject) {
        this.anObject = anObject;
    }
}
