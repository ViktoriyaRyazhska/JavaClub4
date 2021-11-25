package basic_program;

import java.util.Scanner;

public class Basic_Program_Task_10 {
    public static String datingRange(int age) {
        return age > 14
                ? (age/2 + 7) + "-" + ((age - 7)*2)
                : (int)(0.90*age) + "-" + (int)(1.10*age);
    }
    public static void solveTask(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int value1 = scanner.nextInt();


        System.out.println("So, now i will return range of years you may date\nResult: ");
        System.out.println("-----------");
        System.out.println(datingRange(value1));
        System.out.println("-----------");

    }
}
