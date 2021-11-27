package string;

import java.util.Scanner;

public class String_Task_7 {
    public static String noSpace(final String x) {
        return x.replaceAll("\\s+","");
    }
    public static void solveTask(){
        System.out.println("This program removes the spaces from the string, then return the resultant string.");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter your string:");
        String value1 = scanner1.nextLine();

        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(noSpace(value1));
        System.out.println("-----------");
    }
}
