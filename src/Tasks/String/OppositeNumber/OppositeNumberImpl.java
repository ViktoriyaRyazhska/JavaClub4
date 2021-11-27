package Tasks.String.OppositeNumber;

import java.util.Scanner;

public class OppositeNumberImpl implements OppositeNumber {
    private int number;

    public OppositeNumberImpl(final Scanner scanner) {
        this.number = scanner.nextInt();
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
