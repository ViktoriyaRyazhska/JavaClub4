package application.tasks.conditions;

import java.util.Scanner;

public class IsDivisible {
    private static boolean isDivisible(long n, long x, long y) {
        return (n % x == 0) && (n % y == 0);
    }

    public static void task() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the divided number and two divider:\n> ");
        long n = in.nextLong();
        long dividerFirst = in.nextLong();
        long dividerSecond = in.nextLong();

        System.out.println("Result: " + isDivisible(n, dividerFirst, dividerSecond) );
    }
}
