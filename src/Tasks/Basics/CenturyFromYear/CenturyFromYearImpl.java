package Tasks.Basics.CenturyFromYear;

import java.util.Scanner;

public class CenturyFromYearImpl implements CenturyFromYear {
    private int year;

    public CenturyFromYearImpl(final Scanner scanner) {
        setYear(scanner.nextInt());
    }

    public CenturyFromYearImpl(final int number) {
        setYear(number);
    }

    public int getYear() {
        return year;
    }

    public void setYear(final int year) {
        this.year = Math.max(year, 1);
    }

    @Override
    public int getCentury() {
        return getYear() % 100 == 0 ? getYear() / 100 : (getYear() / 100) + 1;
    }
}
