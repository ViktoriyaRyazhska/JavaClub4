package application.tasks.basic;

import java.util.Scanner;

public class GrassHopper {
    public static String weatherInfo(int temp) {
        double c = convertToCelsius(temp);
        if (c <= 0)
            return (c + " is freezing temperature");
        else
            return (c + " is above freezing temperature");
    }

    public static double convertToCelsius(int temperature) {
        double celsius = (temperature - 32) * 5 / 9.0;
        return celsius;
    }

    public String getWeatherInfo(int temp) {
        return weatherInfo(temp);
    }

    public double getConvertToCelsius(int temp) {
        return convertToCelsius(temp);
    }
    public static void task(Scanner in) {

        System.out.print("Enter temperature in the fahrenheit:\n> ");
        int temp = in.nextInt();
        System.out.println(weatherInfo(temp));
    }
}
