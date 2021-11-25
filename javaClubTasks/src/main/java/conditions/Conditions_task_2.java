package conditions;

import java.util.Scanner;

public class Conditions_task_2 {
    public static boolean isDivisible(long n, long x, long y) {
        return n % x == 0 && n % y == 0 ? true : false;
    }
    public static void solveTask(){
        System.out.println("This program takes three integers and returns true if the first number\n" +
                "is divisible by second and third or false if it is not\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number:");
        int value1 = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter your second number:");
        int value2 = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter your third number:");
        int value3 = scanner2.nextInt();

        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(isDivisible(value1,value2,value3));
        System.out.println("-----------");

    }
}
