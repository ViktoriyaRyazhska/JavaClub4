package Tasks.Basics.YouCantCode;

import java.util.Scanner;

public class YouCantCodeImpl implements YouCantCode{
    private int number;

    public YouCantCodeImpl(final Scanner scanner) {
        this.number = scanner.nextInt();
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

