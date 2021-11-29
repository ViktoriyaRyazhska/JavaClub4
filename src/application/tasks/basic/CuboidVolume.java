package application.tasks.basic;

import java.util.Scanner;

public class CuboidVolume {
    private static double volume(double length, double height, double width) {
        return length * height * width;
    }

    public double getVolume(double length, double height, double width) {
        return volume(length, height, width);
    }

    public static void task(Scanner scanner) {
        System.out.print("Enter the length, height and width of cuboid:\n> ");
        double length = scanner.nextDouble();
        double height = scanner.nextDouble();
        double width = scanner.nextDouble();
        if (length <= 0 || height <= 0 || width <= 0) {
            System.out.println("Error.. invalid input");
            task(scanner);
        } else {
            System.out.println("Result: " + volume(length, height, width));
        }
    }
}
