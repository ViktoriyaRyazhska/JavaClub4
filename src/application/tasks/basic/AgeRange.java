package application.tasks.basic;

import java.util.Scanner;

public class AgeRange {
    private static int minAge(int age) {
        int minAge = 0;
        if (age > 14 && age <= 100) {
            minAge = (age / 2) + 7;
        } else if (age <= 14 && age >= 1) {
            minAge = (int) (age - 0.10 * age);
        } else {
            minAge = -1;
        }

        return minAge;
    }

    private static int maxAge(int age) {
        int maxAge = 0;
        if (age > 14 && age <= 100) {
            maxAge = (age - 7) * 2;
        } else if (age <= 14 && age >= 1) {
            maxAge = (int) (age + 0.10 * age);
        } else {
            maxAge = -1;
        }

        return maxAge;
    }

    private static String output(int age) {
        return minAge(age) + "-" + maxAge(age);
    }

    public String getOutput(int age) {
        return output(age);
    }

    public static void task(Scanner scanner) {
        System.out.print("Enter your age:\n> ");
        int age = scanner.nextInt();
        if (minAge(age) == -1 || maxAge(age) == -1) {
            System.out.println("Error.. invalid input");
            task(scanner);
        } else {
            System.out.println("Result: " + output(age));
        }
    }
}
