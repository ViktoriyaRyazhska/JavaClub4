package Switchs.BasicsSwitch;

import Switchs.Switch;
import Main.MainSwitch.*;
import Tasks.Basics.AgeRangeCompatibility.*;
import Tasks.Basics.BeginnerSeries2Clock.*;
import Tasks.Basics.CenturyFromYear.*;
import Tasks.Basics.ConvertToBinary.*;
import Tasks.Basics.DebugCelsiusConverter.*;
import Tasks.Basics.JennySecretMessage.*;
import Tasks.Basics.MultiplyTwoNumbers.*;
import Tasks.Basics.ReturnNegative.*;
import Tasks.Basics.ThinkfulNumber.*;
import Tasks.Basics.VolumeOfACuboid.*;
import Tasks.Basics.YouCantCode.*;

import java.util.Scanner;

public class BasicsSwitch implements Switch {
    @Override
    public void ChooseOption(final Scanner scanner) {
        System.out.println(ShowOptions());
        System.out.println("Choose one of options: ");
        final int task = scanner.nextInt();
        scanner.nextLine();

        switch (task) {
            case 1 -> {
                System.out.println("Enter your age: ");
                final AgeRangeCompatibility ageRangeCompatibility = new AgeRangeCompatibilityImpl(scanner);
                System.out.println("Your 'recommended' age range in which to date someone is: " + ageRangeCompatibility.datingRange());
            }
            case 2 -> {
                System.out.println("Enter hours, minutes and seconds: ");
                final BegginerSeries2Clock begginerSeries2Clock = new BeginnerSeries2ClockImpl(scanner);
                System.out.println("It is how much time passed since midnight: " + begginerSeries2Clock.passedTime());
            }
            case 3 -> {
                System.out.println("Enter a year: ");
                final CenturyFromYear centuryFromYear = new CenturyFromYearImpl(scanner);
                System.out.println("It is what century is now: " + centuryFromYear.century());
            }
            case 4 -> {
                System.out.println("Enter a number: ");
                final ConvertToBinary convertToBinary = new ConvertToBinaryImpl(scanner);
                System.out.println("It is a binary format of input number: " + convertToBinary.toBinary());
            }
            case 5 -> {
                System.out.println("Enter a temperature in fahrenheit: ");
                final DebugCelsiusConverter debugCelsiusConverter = new DebugCelsiusConverterImpl(scanner);
                System.out.println("It is a temperature in celsius: " + debugCelsiusConverter.convertToCelsius());
            }
            case 6 -> {
                System.out.println("Enter a name: ");
                final JennySecretMessage jennySecretMessage = new JennySecretMessageImpl(scanner);
                System.out.println("It is a message for person: " + jennySecretMessage.toGreet());
            }
            case 7 -> {
                System.out.println("Enter two numbers: ");
                final MultiplyTwoNumbers multiplyTwoNumbers = new MultiplyTwoNumbersImpl(scanner);
                System.out.println("It is a product of two numbers: " + multiplyTwoNumbers.multiply());
            }
            case 8 -> {
                System.out.println("Enter a number: ");
                final ReturnNegative returnNegative = new ReturnNegativeImpl(scanner);
                System.out.println("It is a negative of input number: " + returnNegative.toNegative());
            }
            case 9 -> {
                System.out.println("Enter a size of wall and pixel: ");
                final ThinkfulNumber thinkfulNumber = new ThinkfulNumberImpl(scanner);
                System.out.println("Can I fit exact number of pixels in this wall?: " + thinkfulNumber.isDivisible());
            }
            case 10 -> {
                System.out.println("Enter a length, width and height of your Cuboid: ");
                final VolumeOfACuboid volumeOfACuboid = new VolumeOfACuboidImpl(scanner);
                System.out.println("It is a volume of your Cuboid: " + volumeOfACuboid.getVolumeOfCuboid());
            }
            case 11 -> {
                System.out.println("Enter a number: ");
                final YouCantCode youCantCode = new YouCantCodeImpl(scanner);
                System.out.println("It is a doubled value of your number: ");
            }
            case 0 -> {
            }
            case -1 -> {
                final MainSwitch mainSwitch = new MainSwitchImpl();
                mainSwitch.ChooseOption(scanner);
            }
            default -> {
                System.out.println("There is no " + task + " option! Try again!");
                new BasicsSwitch().ChooseOption(scanner);
            }
        }
    }

    @Override
    public String ShowOptions() {
        return """
                List of options:\040
                1. AgeRangeCompatibility
                2. BeginnerSeries2Clock
                3. CenturyFromYear
                4. ConvertToBinary
                5. DebugCelsiusConverter
                6. JennySecretMessage
                7. MultiplyTwoNumbers
                8. ReturnNegative
                9. ThinkfulNumber
                10. VolumeOfACuboid
                11. YouCantCode
                0. EXIT
                 -1. Return to main Menu
                """;
    }
}
