package loops;

import java.util.Scanner;

public class Loops_Task_11 {
    public static int TwiceAsOld(int dadYears, int sonYears){
        return Math.abs((sonYears*2)-dadYears);
    }
    public static void solveTask(){
        System.out.println("This program calculates how many years ago the father was twice as old as his son (or in how many years he will be twice as old)");

        System.out.println("Please enter dad years: ");
        Scanner scanner1 = new Scanner(System.in);
        int value1 = scanner1.nextInt();

        System.out.println("Please enter son years: ");
        Scanner scanner2 = new Scanner(System.in);
        int value2 = scanner2.nextInt();

        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(TwiceAsOld(value1, value2));
        System.out.println("-----------");

    }
}
