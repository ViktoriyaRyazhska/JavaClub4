package application.tasks.string;

import java.util.Scanner;

public class NumberToString {
    private static String convert(int number) {
        return number + "";
    }

    public String getConvert(int number) {
        return convert(number);
    }

    public static void task(Scanner scanner) {
        System.out.print("Enter the number to convert:\n> ");
        int number = scanner.nextInt();
        try {
            System.out.println("Result: " + convert(number));
        } catch (Exception n) {
            System.out.println("Sorry.. invalid input");
        }
    }
}
