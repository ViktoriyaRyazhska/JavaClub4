package basic_program;

import java.util.Scanner;

public class Basic_Program_Task_9 {

    public static int makeNegative(final int x) {
        if (x < 0) {
            return x;
        }
        return -x;
    }

    public static void solveTask(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter single int");
        int value1 = scanner.nextInt();


        System.out.println("Now i will return you negative version of it\nResult: ");
        System.out.println("-----------");
        System.out.println(makeNegative(value1));
        System.out.println("-----------");

    }
}
