package application.tasks.basic;

import java.util.Scanner;

public class CuboidVolume {
    private static int volume(int length, int height, int width) {
        return length * height * width;
    }

    public static void task() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length, height and width of cuboid: ");
        int length = in.nextInt();
        int height = in.nextInt();
        int width = in.nextInt();
        System.out.println("Result: " + volume(length, height, width));
    }
}
