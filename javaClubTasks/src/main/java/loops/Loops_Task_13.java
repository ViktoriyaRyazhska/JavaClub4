package loops;

import java.util.Scanner;

public class Loops_Task_13 {

    public static int summation(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void solveTask(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello there! This program finds the summation of every number from 1 to number that you enter.\n" +
                " The number will always be a positive integer greater than 0.\n" +
                "Please enter the number:  ");
        int number = scanner.nextInt();

        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(summation(number));
        System.out.println("-----------");
    }
}
