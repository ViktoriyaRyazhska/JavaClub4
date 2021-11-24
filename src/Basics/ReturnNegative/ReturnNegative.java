package Basics.ReturnNegative;

/**
 * In this simple assignment you are given a number and have to make it negative.
 * But maybe the number is already negative?
 */
public class ReturnNegative {
    public static int makeNegative(final int x) {
        return x > 0 ? -x : x;
    }
}
