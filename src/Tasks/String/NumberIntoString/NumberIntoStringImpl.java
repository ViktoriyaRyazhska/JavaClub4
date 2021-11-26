package Tasks.String.NumberIntoString;

public class NumberIntoStringImpl implements NumberIntoString {
    private int number;

    public NumberIntoStringImpl(final int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(final int number) {
        this.number = number;
    }

    @Override
    public String convertToString() {
        return getNumber() + " ";
    }
}
