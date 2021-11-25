package String.OppositeNumber;

public class OppositeNumberImpl implements OppositeNumber{
    private int number;

    public OppositeNumberImpl(final int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(final int number) {
        this.number = number;
    }

    @Override
    public int toOppositeNumber() {
        return -getNumber();
    }
}
