package string;

import java.util.Scanner;

public class String_Task_1 {
    public static String numberToString(int num) {
        return Integer.toString(num);
    }

    public static void solveTask(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello there! This program converts a number to a string\n" +
                "Please enter the number which you want to convert to a string type:\n ");
        Integer num = scanner.nextInt();


        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println("Type of variable before converting - "+num.getClass().getSimpleName());
        System.out.println(numberToString(num));
        System.out.println("Converting successful...");
        System.out.println("Type of variable - "+numberToString(num).getClass().getSimpleName());
        System.out.println("You can see that the type of variable has changed to String");
        System.out.println("-----------");

    }
}
