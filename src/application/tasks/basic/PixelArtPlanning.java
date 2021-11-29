package application.tasks.basic;

import java.util.Scanner;

public class PixelArtPlanning {
    public static boolean isDivisible(int wallLength, int pixelSize) {
        int result = wallLength % pixelSize;

        if (result == 0)
            return true;
        else
            return false;
    }

    public boolean getIsDivisible(int wallLength, int pixelSize) {
        return isDivisible(wallLength, pixelSize);
    }

    public static void task(Scanner in) {

        System.out.print("Enter the size of the wall in millimeters:\n> ");
        int wallLength = in.nextInt();
        System.out.print("Enter the size of a pixel in millimeters:\n> ");
        int pixelSize = in.nextInt();

        if (isDivisible(wallLength, pixelSize) == true)
            System.out.println("You can fit an exact number of pixels on the given wall");
        else
            System.out.println("You can't fit an exact number of pixels on the given wall");
    }
}
