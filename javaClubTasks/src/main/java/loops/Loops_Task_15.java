package loops;

import java.util.Scanner;

public class Loops_Task_15 {
    public static int makeMove(int sticks) {
        return sticks % 4;
    }
    public static void solveTask(){
        System.out.println("This program Create a robot that will always win the game");
        System.out.println("Enter the number of sticks: ");

        Scanner scanner1 = new Scanner(System.in);
        int value1;
        while (!scanner1.hasNextInt()) {
            System.out.println("That's not an integer, enter integer type:");
            scanner1.next();
        }
        value1 = scanner1.nextInt();
        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(makeMove(value1));
        System.out.println("-----------");

    }
}
