package Tasks.Classes.LombokEncapsulation;
/* We have to do the following modifications to properly encapsulate info:

        make fields private
provide accessors to the internal fields ( setters/getters )
        provide an empty constructor to support Java Beans specification
        Add a constructor that can receive parameters for all of the fields */

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
