package Basics.YouCantCode;

/**
 * Code as fast as you can! You need to double the integer and return it.
 */
public class YouCantCodeImpl implements YouCantCode{
    private int number;

    public YouCantCodeImpl(final int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(final int number) {
        this.number = number;
    }

    @Override
    public int doubleInteger() {
        return getNumber() * 2;
    }
}

