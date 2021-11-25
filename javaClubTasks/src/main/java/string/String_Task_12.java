package string;

import java.util.Scanner;

public class String_Task_12 {

    public static String weatherInfo(double temp) {
        double c = convertToCelsius(temp);
        if (c <= 0)
            return (c + " is freezing temperature");
        else
            return (c + " is above freezing temperature");
    }

    public static double convertToCelsius(double temperature) {
        double celsius = (temperature - 32) * 5 / 9;
        return celsius;
    }

    public static void main(String[] args) {
        System.out.println(weatherInfo(23));
        System.out.println(weatherInfo(50));
    }

    public static void solveTask() {
        System.out.println("Find the errors in the code to get the celsius converter working properly.\n" +
                "\n" +
                "To convert fahrenheit to celsius");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature:");
        double value1 = scanner.nextInt();

        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(weatherInfo(value1));
        System.out.println("-----------");

    }

}
