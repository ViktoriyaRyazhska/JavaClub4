package Implementation;
import Basic.*;

import java.util.Scanner;

public class BasicImpl {

    public static void  JennysSecretMessage(Scanner scanner){
        System.out.println("JennysSecretMessage");
        System.out.println("Enter your name:");
        String name = scanner.next();
        System.out.println(JennysSecretMessage.greet(name));
    }

    public static void  MultiplyingTwoNumbers(Scanner scanner){
        System.out.println("--function-3-multiplying-two-numbers--");
        System.out.println("Введіть числа для перемноження");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("Your result is: " + MultiplyingTwoNumbers.multiply(x,y));
    }

    public static void VolumeOfACuboid(Scanner scanner){
        System.out.println("---VolumeOfACuboid---");
        System.out.println("Enter values");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();
        System.out.println("Your result is: " + VolumeOfACuboid.getVolumeOfCuboid(x,y,z));
    }

    public static void DoubleInteger (Scanner scanner){
        System.out.println("---Double integer---");
        System.out.println("Enter value");
        int number = scanner.nextInt();
        System.out.println("Your result is: " + DoubleInteger.doubleInteger(number));
    }

    public static void ThinkfulNumberDrillsPixelartPlanning (Scanner scanner){
        System.out.println("---Thinkful number drills pixelart planning---");
        System.out.println("Enter values");
        int wallLength = scanner.nextInt();
        int pixelSize = scanner.nextInt();
        System.out.println("Your result is: " + ThinkfulNumberDrillsPixelartPlanning.isDivisible(wallLength, pixelSize));
    }

    public static void ConvertToBinary (Scanner scanner){
        System.out.println("---Convert to binary---");
        System.out.println("Enter value");
        int number = scanner.nextInt();
        System.out.println("Your result is: " + ConvertToBinary.toBinary(number));
    }

    public static void Clock (Scanner scanner){
        System.out.println("---Clock---");
        System.out.println("Enter hours");
        int hours = scanner.nextInt();
        System.out.println("Enter minutes");
        int minutes = scanner.nextInt();
        System.out.println("Enter seconds");
        int seconds = scanner.nextInt();
        System.out.println("Your result is: " + Clock.Past(hours, minutes, seconds));
    }

    public static void CenturyFromYear (Scanner scanner){
        System.out.println("---Century from year---");
        System.out.println("Enter value");
        int year = scanner.nextInt();
        System.out.println("Your result is: " + CenturyFromYear.Century(year));
    }

    public static void ReturnNegative (Scanner scanner){
        System.out.println("---Return negative---");
        System.out.println("Enter value");
        int x = scanner.nextInt();
        System.out.println("Your result is: " + ReturnNegative.makeNegative(x));
    }

    public static void AgeRangeCompatibilityEquation (Scanner scanner){
        System.out.println("---Age range compatibility equation---");
        System.out.println("Enter value");
        int age = scanner.nextInt();
        AgeRangeCompatibilityEquation.CompatibilityEquation(age);
    }
    public static void CelsiusConverter (Scanner scanner){
        System.out.println("---Celsius converter---");
        System.out.println("Enter value");
        int temp = scanner.nextInt();
        CelsiusConverter.weatherInfo(temp);
    }




    
}
