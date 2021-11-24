package application.tasks.string;

import java.util.Scanner;

public class ReplaceDots {
    private static String replace(String str) {
        return str.replace('.', '-');
    }

    public static void task(Scanner scanner) {
        System.out.print("Enter text with dots:\n> ");
        String str = scanner.nextLine();
        System.out.println("Result: " + replace(str));
    }
}
