package basic_program;

import collections.Collections_Task_4;

import java.util.Scanner;

public class Basic_Program_Task_1 {
    public static int doubleInteger(int i) {
        return i * 2;
    }

    public static void solveTask(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter single integer:");
        int value1 = scanner.nextInt();


        System.out.println("So, now i will double it\nResult: ");
        System.out.println("-----------");
        System.out.println(doubleInteger(value1));
        System.out.println("-----------");

    }

}
