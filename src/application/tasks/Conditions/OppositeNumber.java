package application.tasks.Conditions;

import java.util.Scanner;

public class OppositeNumber {
    private static int opposite(int number) {
        return 0 - number;
    }

    public static void task() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to make opposite:\n> ");
        int number = in.nextInt();
        System.out.println("Result: " + opposite(number));
    }
}
