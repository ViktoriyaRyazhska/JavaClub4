package basic_program;

import java.util.Scanner;

public class Basic_Program_Task_5 {

    public static String greet(String name) {
        if (name.equals("Johnny"))
            return "Hello, my love!";
        return String.format("Hello, %s!", name);
    }

    public static void solveTask(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:\nMaybe you will get lucky and Jenny loves you");
        String value1 = scanner.nextLine();

        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(greet(value1));
        System.out.println("-----------");

    }
}
