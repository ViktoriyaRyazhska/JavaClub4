package basic_program;

import java.util.Scanner;

import static main.MenuImpl.chooseMenu;

public class Basic_Program_Task_2 {
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static void solveTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        while (!scanner.hasNextInt()) {
            System.out.println("That's not an integer, enter integer type:");
            scanner.next();
        }
        int value1 = scanner.nextInt();
        System.out.println("Enter second number:");
        while (!scanner.hasNextInt()) {
            System.out.println("That's not an integer, enter integer type:");
            scanner.next();
        }
        int value2 = scanner.nextInt();

        System.out.println("So, now i will multiply this numbers\nResult: ");
        System.out.println("-----------");
        System.out.println(multiply(value1, value2));
        System.out.println("-----------");

    }
}
