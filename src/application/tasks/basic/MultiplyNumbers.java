package application.tasks.basic;

import java.util.Scanner;

public class MultiplyNumbers {
    private static int multiply(int number1, int number2) {
        return number1 * number2;
    }

    public int getMultiplied(int number1, int number2) {
        return multiply(number1, number2);
    }

    public static void task(Scanner scanner) {
        System.out.print("Enter two numbers to multiply:\n> ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println("Result: " + multiply(number1, number2));
    }
}
