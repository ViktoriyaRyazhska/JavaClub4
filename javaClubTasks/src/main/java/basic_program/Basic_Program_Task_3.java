package basic_program;

import java.util.Scanner;

public class Basic_Program_Task_3 {
    public static double getVolumeOfCuboid(final double length, final double width, final double height) {

        return length*width*height;
    }
    public static void solveTask(){
        System.out.println("This program  calculates the volume of a cuboid ");

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter your length:");
        int value1 ;
        while (!scanner1.hasNextInt()) {
            System.out.println("This is not a length, enter the length:");
            scanner1.next();
        }
        value1 = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter your width:");
        int value2 ;
        while (!scanner2.hasNextInt()) {
            System.out.println("This is not a width, enter the width:");
            scanner2.next();
        }
        value2 = scanner2.nextInt();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Enter your height:");
        int value3 ;
        while (!scanner3.hasNextInt()) {
            System.out.println("This is not a height, enter the height:");
            scanner3.next();
        }
        value3 = scanner3.nextInt();

        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(getVolumeOfCuboid(value1,value2,value3));
        System.out.println("-----------");

    }
}
