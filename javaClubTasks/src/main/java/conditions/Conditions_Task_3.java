package conditions;

import java.util.Scanner;

public class Conditions_Task_3 {
    public static String convert(boolean b){
        return b ? "true" : "false";
    }
    public static void solveTask(){

        System.out.println("This program implements a function which convert the given boolean value into string representation");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter b:");
        boolean value1;
        while (!scanner.hasNextBoolean()) {
          System.out.println("That's not an boolean, enter boolean type:");
            scanner.next();
        }
        value1 = scanner.nextBoolean();
        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(convert(value1));
        System.out.println("-----------");
    }
}
