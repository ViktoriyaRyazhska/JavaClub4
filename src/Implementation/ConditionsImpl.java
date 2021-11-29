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

    public static void countAgeDiff(){
        System.out.println("AgeDiff");
        System.out.println("Введіть рік народження і час до");
        Scanner scanner = new Scanner(System.in);
        int birthYear = scanner.nextInt();
        int year = scanner.nextInt();

        System.out.println(AgeDiff.calculateAge(birthYear, year));
        scanner.close();
    }

    public static void isThereEnoughSpace(){
        System.out.println("will-there-be-enough-space");
        System.out.println("Введіть загальну к-ть місць, к-ть людей на автобусі і к-ть чекаючих");

        Scanner scanner = new Scanner(System.in);
        int cap = scanner.nextInt();
        int on = scanner.nextInt();
        int wait = scanner.nextInt();

        System.out.println(Bob.enough(cap, on, wait));
        scanner.close();
    }
}
