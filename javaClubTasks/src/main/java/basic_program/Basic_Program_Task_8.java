package basic_program;

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

    public static void solveTask(){
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
