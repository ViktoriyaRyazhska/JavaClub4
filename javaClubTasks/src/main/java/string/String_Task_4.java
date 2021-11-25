package string;

import java.util.Scanner;

public class String_Task_4 {
    public static int opposite(int number) {
        return number - number * 2;
    }

    public static void solveTask() {
        System.out.println("given a number, find its opposite.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int value1 = scanner.nextInt();

        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(opposite(value1));
        System.out.println("-----------");

    }

}
