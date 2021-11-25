package Basics.CenturyFromYear;

import java.util.Scanner;

/**
 * Introduction
 * The first century spans from the year 1 up to and including the year 100,
 * the second century - from the year 101 up to and including the year 200, etc.
 */
public class CenturyFromYearImpl implements CenturyFromYear {
    private int number;

    public CenturyFromYearImpl(final Scanner scanner) {
        setNumber(scanner.nextInt());
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(final int number) {
        this.number = Math.max(number, 1);
    }

    @Override
    public int century() {
        return getNumber() % 100 == 0 ? getNumber() / 100 : (getNumber() / 100) + 1;
    }
}
