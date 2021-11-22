package application.tasks.loops;

import java.util.Scanner;

public class Summation {
    private static int summation(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }

        return result;
    }

    public static void task() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter amount of number to sum:\n> ");
        int n = in.nextInt();
        if (n <= 0) {
            System.out.println("Error.. invalid input");
            task();
        } else {
            System.out.println("Result: " + summation(n));
        }
    }
}
