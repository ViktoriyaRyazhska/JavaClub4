package conditions;

import java.util.Scanner;

public class Conditions_task_1 {
    public static int opposite(int number) {
        int oppositeNumber = number * (-1);
        return oppositeNumber;
    }

    public static void solveTask(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello there! This tasks makes the number which entered opposite");
        System.out.println("Please enter the integer number which you want to make opposite: ");
        int value1 = scanner.nextInt();

        System.out.println("And the opposite is: ");
        System.out.println("-----------");
        System.out.println(opposite(value1));
        System.out.println("-----------");

    }
}
