package Switchs.BasicsSwitch;

import Tasks.Basics.AgeRangeCompatibility.AgeRangeCompatibility;
import Tasks.Basics.AgeRangeCompatibility.AgeRangeCompatibilityImpl;
import Tasks.Basics.BeginnerSeries2Clock.BegginerSeries2Clock;
import Tasks.Basics.BeginnerSeries2Clock.BeginnerSeries2ClockImpl;
import Tasks.Basics.CenturyFromYear.CenturyFromYear;
import Tasks.Basics.CenturyFromYear.CenturyFromYearImpl;
import Tasks.Basics.ConvertToBinary.ConvertToBinary;
import Tasks.Basics.ConvertToBinary.ConvertToBinaryImpl;
import Tasks.Basics.DebugCelsiusConverter.DebugCelsiusConverter;
import Tasks.Basics.DebugCelsiusConverter.DebugCelsiusConverterImpl;
import Tasks.Basics.JennySecretMessage.JennySecretMessage;
import Tasks.Basics.JennySecretMessage.JennySecretMessageImpl;
import Tasks.Basics.MultiplyTwoNumbers.MultiplyTwoNumbers;
import Tasks.Basics.MultiplyTwoNumbers.MultiplyTwoNumbersImpl;
import Tasks.Basics.ReturnNegative.ReturnNegative;
import Tasks.Basics.ReturnNegative.ReturnNegativeImpl;
import Tasks.Basics.ThinkfulNumber.ThinkfulNumber;
import Tasks.Basics.ThinkfulNumber.ThinkfulNumberImpl;
import Tasks.Basics.VolumeOfACuboid.VolumeOfACuboid;
import Tasks.Basics.VolumeOfACuboid.VolumeOfACuboidImpl;
import Tasks.Basics.YouCantCode.YouCantCode;
import Tasks.Basics.YouCantCode.YouCantCodeImpl;

import java.util.Scanner;

public class BasicsSwitch {

    public void ChooseOption(final Scanner scanner){
        System.out.println(ShowOptions());
        System.out.println("Choose one of options: ");
        final int task = scanner.nextInt();
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
            default -> System.out.println("There is no such option! Please, enter right option: ");
        }
    }

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
                """;
    }
}
