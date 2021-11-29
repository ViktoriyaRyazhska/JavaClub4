package application.tasks.conditions;

import java.util.Scanner;

public class TheModuloSequence {
    private static int findNth(int n) {
        int[] sequence = new int[n + 1];
        sequence[0] = 0;
        sequence[1] = 1;
        for (int i = 2; i < n; i++) {
            sequence[i] = (sequence[i - 1] + sequence[i - 2]) % 3;
        }

        return sequence[n - 1];
    }

    public int getFindNth(int n) {
        return findNth(n);
    }

    public static void task(Scanner scanner) {
        System.out.print("Enter the index of number to find:\n> ");
        int n = scanner.nextInt();
        if (n < 1) {
            System.out.println("Error.. invalid input");
            task(scanner);
        } else {
            System.out.println("Result: " + findNth(n));
        }
    }
}

