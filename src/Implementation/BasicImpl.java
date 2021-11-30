package Implementation;
import Basic.*;
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class BasicImpl {

    public static void  JennysSecretMessage(Scanner scanner){
        System.out.println("Jennys secret message");
        System.out.println("Returns a greeting for a user." +
                " However, Jenny is in love with Johnny, and would like to greet him slightly different.");
        System.out.println("Enter your name:");
        String name = scanner.next();
        System.out.println(JennysSecretMessage.greet(name));
    }

    public static void  MultiplyingTwoNumbers(Scanner scanner){
        System.out.println("Multiplying two numbers");
        System.out.println("Введіть 2 числа для перемноження");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("Your result is: " + MultiplyingTwoNumbers.multiply(x,y));
    }

    public static void VolumeOfACuboid(Scanner scanner){
        System.out.println("Volume of a cuboid");
        System.out.println("Function to help to calculate the volume of a cuboid with three values");
        System.out.println("Введіть 3 сторони для перемноження");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();
        System.out.println("Your result is: " + VolumeOfACuboid.getVolumeOfCuboid(x,y,z));
    }

    public static void DoubleInteger (Scanner scanner){
        System.out.println("Double integer");
        System.out.println("Введіть число яке буде помножено на 2");
        int number = scanner.nextInt();
        System.out.println("Your result is: " + DoubleInteger.doubleInteger(number));
    }

    public static void ThinkfulNumberDrillsPixelartPlanning (Scanner scanner){
        System.out.println("Thinkful number drills pixelart planning");
        System.out.println("Function should take two arguments:" +
                " \nthe size of the wall in millimeters and the size of a pixel in millimeters." +
                " \nIt should return True if you can fit an exact number of pixels on the wall," +
                " \notherwise it should return False.");
        System.out.println("Введіть довжину стіни");
        int wallLength = scanner.nextInt();
        System.out.println("Введіть розмір пікселя");
        int pixelSize = scanner.nextInt();
        System.out.println("Your result is: " + ThinkfulNumberDrillsPixelartPlanning.isDivisible(wallLength, pixelSize));
    }

    public static void ConvertToBinary (Scanner scanner){
        System.out.println("Convert to binary");
        System.out.println("Returns that number in a binary format");
        System.out.println("Введіть десяткове число, яке буде перетіорене в двійкове");
        int number = scanner.nextInt();
        System.out.println("Your result is: " + ConvertToBinary.toBinary(number));
    }

    public static void Clock (Scanner scanner){
        System.out.println("Clock");
        System.out.println("Returns the time since midnight in milliseconds");
        System.out.println("Enter hours");
        int hours = scanner.nextInt();
        System.out.println("Enter minutes");
        int minutes = scanner.nextInt();
        System.out.println("Enter seconds");
        int seconds = scanner.nextInt();
        System.out.println("Time since midnight in milliseconds: " + Clock.Past(hours, minutes, seconds));
    }

    public static void CenturyFromYear (Scanner scanner){
        System.out.println("Century from year");
        System.out.println("Return the century of year");
        System.out.println("Enter year");
        int year = scanner.nextInt();
        System.out.println("Your result is: " + CenturyFromYear.Century(year));
    }

    public static void ReturnNegative (Scanner scanner){
        System.out.println("Return negative");
        System.out.println("Make number negative");
        System.out.println("Enter number");
        int x = scanner.nextInt();
        System.out.println("Your negative number is: " + ReturnNegative.makeNegative(x));
    }

    public static void AgeRangeCompatibilityEquation (Scanner scanner){
        System.out.println("Age range compatibility equation");
        System.out.println("Give a result using \"dating rule\"");
        System.out.println("Enter age");
        int age = scanner.nextInt();
        AgeRangeCompatibilityEquation.CompatibilityEquation(age);
    }
    public static void CelsiusConverter (Scanner scanner){
        System.out.println("Celsius converter");
        System.out.println("Convert fahrenheit to celsius");
        System.out.println("Enter temperature");
        int temp = scanner.nextInt();
        System.out.println(CelsiusConverter.weatherInfo(temp));
    }

}
