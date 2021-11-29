package application.tasks.basic;
import java.util.Scanner;
public class UnderPressure {
    private static int doubleInteger(int number) {
        return number * 2;
    }

    public int getDoubleInteger(int number) {
        return doubleInteger(number);
    }

    public static void task(Scanner scanner) {
        System.out.print("Enter the number to double:\n> ");
        int number = scanner.nextInt();
        System.out.println("Result: " + doubleInteger(number));
    }
}
