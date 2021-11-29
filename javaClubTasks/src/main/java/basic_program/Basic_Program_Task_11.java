package basic_program;

import java.util.Scanner;

public class Basic_Program_Task_11 {
    public static String weatherInfo(int temp) {
        double c=convertToCelsius(temp);
        if (c < 0)
            return (c + " is freezing temperature");
        else
            return (c + " is above freezing temperature");
    }

    public static double convertToCelsius(int temperature) {
        double celsius = (temperature-32)*(5/9.0);
        return celsius;
    }
    public static void solveTask(){
        System.out.println("This program converts fahrenheit to celsius");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature :");
        int value1;
        while (!scanner.hasNextInt()) {
            System.out.println("That's not an temperature, enter temperature :");
            scanner.next();
        }
        value1 = scanner.nextInt();
//        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("Enter the temprature:");
//        int value1 = scanner1.nextInt();
//        while (!scanner1.hasNextInt()) {
//            System.out.println("That's not the temprature, enter temprature:");
//            scanner1.next();
//        }
//        value1 = scanner1.nextInt();
        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(weatherInfo(value1));
        System.out.println("-----------");

    }
}
