package string;

import java.util.Scanner;

public class String_Task_5 {

    public static String replaceDots(final String str) {
        return str.replaceAll("\\.", "-");
    }


    public static void solveTask(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello there! This program replaces all dots in string\n" +
                "Please enter string with dots to make sure if task works correctly:\n ");
        String line = scanner.nextLine();

        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println("You've entered: "+line);
        System.out.println("Replacing successful");
        System.out.println("Changed line:\n"+replaceDots(line));
        System.out.println("-----------");

    }
}
