package application.tasks.conditions;

import java.util.Scanner;

public class OppositeNumber {
    private static int opposite(int number) {
        return 0 - number;
    }

    public int getOpposite(int number) {
        return opposite(number);
    }

    public static void task(Scanner scanner) {
        System.out.print("Enter the number to make opposite:\n> ");
        int number = scanner.nextInt();
        System.out.println("Result: " + opposite(number));
    }
}
