package Tasks.String.NumberIntoString;

import java.util.Scanner;

public class NumberIntoStringImpl implements NumberIntoString {
    private int number;

    public NumberIntoStringImpl(final Scanner scanner) {
        this.number = scanner.nextInt();
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
