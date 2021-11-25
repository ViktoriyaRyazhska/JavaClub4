package basic_program;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Basic_Program_Task_8 {
    public static boolean isDivisible(int wallLength, int pixelSize) {
        int result = wallLength % pixelSize;

        if (result == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isDivisible(2045, 5));

    }

    public static void solveTask() {
        System.out.println("This method should take two arguments: the size of the wall in millimeters and the size of a pixel in millimeters. \n " +
                "It should return True if you can fit an exact number of pixels on the wall, otherwise it should return False");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the wallLength:");
        int value1 = scanner.nextInt();
        System.out.println("Enter the pixelSize:");
        int value2 = scanner.nextInt();

        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(isDivisible(value1, value2));
        System.out.println("-----------");

    }
}
