package application.tasks.string;

import java.util.Scanner;

public class Banjo {
    private static String arePlaying(String name) {
        String result = " does not play banjo";
        if (name.toLowerCase().charAt(0) == 'r') {
            result = " plays banjo";
        }

        return name + result;
    }

    public String getArePlaying(String name) {
        return arePlaying(name);
    }

    public static void task(Scanner scanner) {
        System.out.print("Enter your name:\n> ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Result: " + arePlaying(name));
    }
}
