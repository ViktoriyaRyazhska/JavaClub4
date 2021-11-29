package application.tasks.conditions;

import java.util.Scanner;

public class BooleanToString {
    private static String convert(boolean flag) {
        String result = "false";
        if (flag == true) {
            result = "true";
        }
        return result;
    }

    public String getConverted(boolean flag) {
        return convert(flag);
    }

    private static boolean input(int option, Scanner scanner) {
        boolean flag = false;
        switch (option) {
            default:
                System.out.println("Error.. invalid input");
                task(scanner);
                break;
            case 1:
                flag = true;
                break;
            case 2:
                flag = false;
                break;
        }

        return flag;
    }

    public static void task(Scanner scanner) {
        System.out.print("Select an option:\n1. True\n2. False\n> ");
        int option = scanner.nextInt();
        System.out.println("Result: " + convert(input(option, scanner)));
    }
}
