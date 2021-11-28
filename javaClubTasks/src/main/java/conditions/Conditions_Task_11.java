package conditions;

import java.util.Scanner;

public class Conditions_Task_11 {
    public static int sequence(int n) {
        int[] nums = new int[]{0, 1, 1, 2, 0, 2, 2, 1};
        return nums[(n-1)%8];
    }
    public static void solveTask(){
        System.out.println("This program  finds the nth number of the sequence");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n:");
        int value1 = scanner.nextInt();


        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(sequence(value1));
        System.out.println("-----------");
    }
}
