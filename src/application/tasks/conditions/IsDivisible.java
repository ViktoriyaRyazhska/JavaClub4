package application.tasks.conditions;

import java.util.Scanner;

public class IsDivisible {
    private static boolean isDivisible(long n, long x, long y) {
        return (n % x == 0) && (n % y == 0);
    }

    public boolean getIsDivisible(long n, long x, long y) {
        return isDivisible(n, x, y);
    }

    public static void task(Scanner scanner) {
        System.out.print("Enter the divided number and two divider:\n> ");
        long n = scanner.nextLong();
        long dividerFirst = scanner.nextLong();
        long dividerSecond = scanner.nextLong();
        if (n <= 0 || dividerFirst <= 0 || dividerSecond <= 0) {
            System.out.println("Error.. invalid input");
            task(scanner);
        } else {
            System.out.println("Result: " + isDivisible(n, dividerFirst, dividerSecond));
        }
    }
}
