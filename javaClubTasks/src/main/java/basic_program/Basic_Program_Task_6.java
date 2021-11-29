package basic_program;

import java.util.Scanner;

public class Basic_Program_Task_6 {
    public static int toBinary(int n) {
        String str = Integer.toBinaryString(n);
        return Integer.parseInt(str);

    }

    public static void solveTask(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter single integer:");
        int value1;
        while (!scanner.hasNextInt()) {
            System.out.println("That's not an integer, enter integer type:");
            scanner.next();
        }
        value1 = scanner.nextInt();


        System.out.println("So, now i will convert it to binary\nResult: ");
        System.out.println("-----------");
        System.out.println(toBinary(value1));
        System.out.println("-----------");
    }
}
