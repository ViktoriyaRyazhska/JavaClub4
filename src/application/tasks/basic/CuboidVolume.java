package application.tasks.basic;

import java.util.Scanner;

public class CuboidVolume {
    private static int volume(int length, int height, int width) {
        return length * height * width;
    }

    public static void task(Scanner scanner) {
        System.out.print("Enter the length, height and width of cuboid:\n> ");
        int length = scanner.nextInt();
        int height = scanner.nextInt();
        int width = scanner.nextInt();
        if (length <= 0 || height <= 0 || width <= 0) {
            System.out.println("Error.. invalid input");
            task(scanner);
        } else {
            System.out.println("Result: " + volume(length, height, width));
        }
    }
}
