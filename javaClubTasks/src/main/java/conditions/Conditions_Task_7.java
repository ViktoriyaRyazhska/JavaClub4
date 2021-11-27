package conditions;

import java.util.Scanner;

public class Conditions_Task_7 {
    public static Integer basicMath(String symbol, int x, int y){
        switch (symbol){
            case "+": return x+y;
            case "-": return x-y;
            case "*": return x*y;
            case "/": return x/y;
        }
        return 0;
    }
    public static void solveTask(){
        System.out.println("This program creates a function that does four basic mathematical operations.\n" +
                "The function should return result of numbers after applying the chosen operation");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter symbol:");
        String value1 = scanner1.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter x:");
        int value2 = scanner2.nextInt();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Enter y:");
        int value3 = scanner3.nextInt();

        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(basicMath(value1,value2,value3));
        System.out.println("-----------");
    }
}