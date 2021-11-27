package Tasks.Basics.ReturnNegative;

import java.util.Scanner;

public class ReturnNegativeImpl implements ReturnNegative {
    private int number;

    public ReturnNegativeImpl(final Scanner scanner) {
        this.number = scanner.nextInt();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(final int number) {
        this.number = number;
    }

    public int toNegative() {
        return getNumber() > 0 ? -getNumber() : getNumber();
    }
}
