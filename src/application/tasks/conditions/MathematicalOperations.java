package application.tasks.Conditions;

import java.util.Scanner;

public class MathematicalOperations {
    public static double task(double var1, double var2, char operation){
        operation = getOperation();
        var1 = getNumber();
        var2 = getNumber();
        double result = solving(var1,var2,operation);
        System.out.println("Result is " + result);
        return result;

    }
    private static char getOperation(){
        Scanner op = new Scanner(System.in);
        System.out.println("Enter your operation  1.+ ,2.- ,3.* ,4/");

        switch (op.nextInt()){
            case 1:
                return '+';
            case 2:
                return '-';
            case 3:
                return '*';
            case 4:
                return  '/';
            default:
                return getOperation();
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

    private static double getNumber(){
        Scanner num = new Scanner(System.in);
        System.out.println("Enter your number");
        return getNumber();
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
