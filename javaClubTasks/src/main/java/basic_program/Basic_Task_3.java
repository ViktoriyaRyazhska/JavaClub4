package basic_program;

import java.util.Scanner;

public class Basic_Task_3 {
    public static double getVolumeOfCuboid(final double length, final double width, final double height) {

        return length*width*height;
    }
    public static void solveTask(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter your length:");
        int value1 = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter your height:");
        int value2 = scanner2.nextInt();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Enter your height:");
        int value3 = scanner3.nextInt();


        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(getVolumeOfCuboid(value1,value2,value3));
        System.out.println("-----------");

    }
}
