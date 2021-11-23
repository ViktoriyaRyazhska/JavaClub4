package basic;

import java.util.Scanner;

public class Task11 {

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

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter temperature in fahrenheit:\n> ");
	        int temp = sc.nextInt();
	        System.out.println(weatherInfo(temp));
	    }
	}