package Basics.BeginnerSeries2Clock;

/**
 * Clock shows h hours, m minutes and s seconds after midnight.
 * Your task is to write a function which returns the time since midnight in milliseconds.
 */

public class BeginnerSeries2Clock {
    public static int Past(int h, int m, int s) {
        return h * 36000000 + m * 60000 + s * 1000;
    }
}
