package com.company1;

public class GrasshopperDebug {
    public static String weatherInfo(int temp) {
        double c = convertToCelsius(temp);
        if (c > 0)
            return (c + " is above freezing temperature");
        else
            return (c + " is freezing temperature");
    }

    public static double convertToCelsius(int temperature) {
        return (temperature - 32) * (5.0/9);
    }
}
