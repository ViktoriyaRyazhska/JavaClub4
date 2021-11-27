package conditions;

import java.util.Scanner;

public class Conditions_Task_3 {
    public static String convert(boolean b){
        return b ? "true" : "false";
    }
    public static void solveTask(){
        System.out.println("This program implements a function which convert the given boolean value into its string representation.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter b:");
        boolean value1 = scanner.nextBoolean();


        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(convert(value1));
        System.out.println("-----------");
    }
}
