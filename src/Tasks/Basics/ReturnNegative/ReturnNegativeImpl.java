package Tasks.Basics.ReturnNegative;

import java.util.Scanner;

/**
 * In this simple assignment you are given a number and have to make it negative.
 * But maybe the number is already negative?
 */
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
        return number > 0 ? -number : number;
    }
}
