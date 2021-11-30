package Implementation;

import java.util.Scanner;
import Conditions.*;

public class ConditionsImpl {
    public static void oppositeNumber() {
        System.out.println("opposite-number");
        System.out.println("Введіть число");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        System.out.println("Протилежне число " + OppositeNumber.opposite(number));
    }

    public static void boolenToStr() {
        System.out.println("convert-a-boolean-to-a-string");
        System.out.println("Введіть 1, якщо true або 0, якщо false");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean b;
        if (number == 1) {
            b = true;
            System.out.println("Ви ввели : " + BooleanToString.convert(b));

        } else if (number == 0) {
            b = false;
            System.out.println("Ви ввели : " + BooleanToString.convert(b));
        }
        scanner.close();
    }

    public static void oppositesAttract(){
        System.out.println("opposites-attract");
        System.out.println("Введіть число пелюсток для квітки 1 і квітки 2");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int number2 = scanner.nextInt();
        if (OppositesAttract.isLove(number, number2))
            System.out.println("Timmy і Sarah закохані");
        else
            System.out.println("Timmy і Sarah не закохані");
        scanner.close();
    }

    public static void traffic(){
        System.out.println("thinkful-logic-drills-traffic-light");
        System.out.println("Введіть колір світлофора : green, yellow або red");
        Scanner scanner = new Scanner(System.in);
        String color = scanner.next();
        System.out.println(TrafficLights.updateLight(color));
        scanner.close();
    }

    public static void DivisibleByXAndY (Scanner scanner) {
        System.out.println("Divisible by x and y");
        System.out.println("Function that checks if a first number is divisible by two next numbers");
        System.out.println("Enter number");
        long n = scanner.nextLong();
        System.out.println("Enter fist divisible");
        long x = scanner.nextLong();
        System.out.println("Enter second divisible");
        long y = scanner.nextLong();
        System.out.println("Result: " + DivisibleNb.isDivisible(n,x,y));
    }

    public static void  BasicOperations (Scanner scanner) {
        System.out.println("Basic operations");
        System.out.println("Function return result of numbers after applying the chosen operation");
        System.out.println("Enter operation(String)");
        String s = scanner.next();
        System.out.println("Enter first number(int)");
        int v1 = scanner.nextInt();
        System.out.println("Enter second number(int)");
        int v2 = scanner.nextInt();
        System.out.println("Result: " + BasicOperations.basicMath(s,v1,v2));
    }

    public static void SwitchItUp (Scanner scanner){
        System.out.println("Switch it up");
        System.out.println("Return value in words");
        System.out.println("Enter int value 0-9 in integer");
        int number = scanner.nextInt();
        System.out.println("Result: " + SwitchItUp.switchItUp(number));
    }
}
