package Tasks.Basics.DebugCelsiusConverter;

import java.util.Scanner;

/**
 * Debug celsius converter
 * Your friend is traveling abroad to the United States
 * so he wrote a program to convert fahrenheit to celsius. Unfortunately his code has some bugs.
 * Find the errors in the code to get the celsius converter working properly.
 * To convert fahrenheit to celsius:
 * celsius = (fahrenheit - 32) * (5/9)
 */

public class DebugCelsiusConverterImpl implements DebugCelsiusConverter{
    private double fahrenheit;

    public DebugCelsiusConverterImpl(final Scanner scanner) {
        setFahrenheit(scanner.nextDouble());
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(final double fahrenheit) {
        if (fahrenheit >= -459.67 && fahrenheit <= 1000) {
            this.fahrenheit = fahrenheit;
        } else {
            this.fahrenheit = Math.random() * ((1000 - (-459.67)) + 1) + (-459.67);
        }
    }

    @Override
    public String weatherInfo() {
        final double c = convertToCelsius();
        if (c >= -30 && c <= -10)
            return c + " is very cold temperature";
        else if (c > -10 && c <= 10)
            return c + " is cold temperature";
        else if (c > 10 && c <= 15)
            return c + " is a cool temperature";
        else if (c > 15 && c <= 20)
            return c + " is warm temperature";
        else if (c > 20 && c <= 30)
            return c + " is a hot temperature";
        else
            return c + "is very hot temperature";
    }

    @Override
    public double convertToCelsius() {
        return (getFahrenheit() - 32) * 5 / 9.0;
    }
}

