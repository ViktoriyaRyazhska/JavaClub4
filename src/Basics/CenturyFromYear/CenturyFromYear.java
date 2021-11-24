package Basics.CenturyFromYear;

/**
 * Introduction
 * The first century spans from the year 1 up to and including the year 100,
 * the second century - from the year 101 up to and including the year 200, etc.
 */
public class CenturyFromYear {
    public static int century(int number) {
        return number % 100 == 0 ? number / 100 : (number / 100) + 1;
    }
}
