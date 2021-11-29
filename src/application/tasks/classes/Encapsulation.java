package application.tasks.classes;

public class Encapsulation {
    private int number;
    private String stringValue;
    private Object anObject;

    public Encapsulation() {
    }

    ;

    Encapsulation(int number, String stringValue, Object anObject) {
        this.number = number;
        this.stringValue = stringValue;
        this.anObject = anObject;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public Object getAnObject() {
        return anObject;
    }

    public void setAnObject(Object anObject) {
        this.anObject = anObject;
    }

    public int getSomething(int n) {
        Encapsulation  encapsulation = new Encapsulation();
        encapsulation.setNumber(n);
        return encapsulation.getNumber();
    }

    public static void task() {
        System.out.println("Done");
    }
}
