package basic_program;

import java.util.Scanner;

public class Basic_Program_Task_7 {
    public static int Past(int h, int m, int s)
    {
        return ((h*60*60)+(m*60)+s)*1000;
    }
    public static void solveTask(){
        System.out.println("This program returns the time since midnight in milliseconds");

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter hours:");
        int value1;
        while (!scanner1.hasNextInt()) {
            System.out.println("That's not the hours, enter hours:");
            scanner1.next();
        }
        value1 = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter minutes:");
        int value2;
        while (!scanner2.hasNextInt()) {
            System.out.println("There are not  minutes, enter minutes:");
            scanner2.next();
        }
        value2 = scanner2.nextInt();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Enter seconds:");
        int value3 ;

        while (!scanner3.hasNextInt()) {
            System.out.println("There are not  seconds, enter seconds:");
            scanner3.next();
        }
        value3 = scanner3.nextInt();

        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(Past(value1,value2,value3));
        System.out.println("-----------");

    }
}
