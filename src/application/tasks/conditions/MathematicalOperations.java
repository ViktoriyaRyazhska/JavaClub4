package application.tasks.conditions;

import java.util.Scanner;

public class MathematicalOperations {
    public static double task(Scanner in){
        double var1 = getNumber(in);
        char operation = getOperation(in);
        double var2 = getNumber(in);
        double result = solving(var1, var2, operation);
        System.out.println("Result is " + result);
        return result;

    }
    private static char getOperation(Scanner in){
        System.out.println("Enter your operation  1.+ ,2.- ,3.* ,4/");

        switch (in.nextInt()){
            case 1:
                return '+';
            case 2:
                return '-';
            case 3:
                return '*';
            case 4:
                return  '/';
            default:
                return getOperation(in);
        }

    }
    private static double add(double var1, double var2){
        return var1 + var2;
    }
    private static double subtraction(double var1, double var2){
        return var1 - var2;
    }
    private static double multiplication(double var1, double var2){
        return var1 * var2;
    }
    private static double division(double var1, double var2){
        return var1 / var2;
    }

    private static double getNumber(Scanner in) {
        System.out.println("Enter your number");
        if (in.hasNextDouble()) {
            return in.nextDouble();
        } else
            return getNumber(in);
    }
    private static double solving(double var1, double var2, char operation){
        switch(operation){
            case '+':
                return add(var1, var2);
            case '-':
                return subtraction(var1, var2);
            case '*':
                return multiplication(var1, var2);
            case '/':
                return division(var1, var2);
            default:
                return Double.NaN;
        }

    }
}
