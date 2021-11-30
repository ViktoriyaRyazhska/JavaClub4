package Application;

import BasicProgram.*;
import Errors.NotANumber;
import Errors.NotAString;

import java.util.Scanner;

class BasicsList {
    public static String basicsList() {
        String tasks =
                "1 - You can't code under the pressure\n" +
                        "2 - Function - 3: Multiplying two number\n" +
                        "3 - Volume of a cuboid\n" +
                        "4 - Thinkful number drills pixelart planning\n" +
                        "5 - Jenny's secret massage\n" +
                        "6 - Convert to binary\n" +
                        "7 - Beginner series number 2 clock\n" +
                        "8 - Century from Year\n" +
                        "9 - Return negative\n" +
                        "10 - Age range compabil1ity equation\n" +
                        "11 - Grasshopper debug";
        return tasks;
    }

    public static void choiceBasics() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice : ");
        int num = NotANumber.CheckInt(scanner);
        try {
            switch (num) {
                default -> {
                    System.out.println("The is no such a task");
                }
                case 1 -> {
                    System.out.println("We can double the integer and return it.");
                    System.out.print("What is your number: ");
                    int n = NotANumber.CheckInt(scanner);
                    System.out.println("Result = " + UCantCode.doubleInteger(n));

                }
                case 2 -> {
                    int count = 1;
                    System.out.println("We can multiply two number. Please type your numbers");
                    System.out.println(Function3.multiply(NotANumber.CheckInt(scanner), NotANumber.CheckInt(scanner)));
                }
                case 3 -> {
                    System.out.println("Here is a program in which we can count volume cuboid");
                    System.out.println("Type parameters of cuboid");
                    System.out.println(VolumeOfCuboid.getVolume(NotANumber.CheckInt(scanner), NotANumber.CheckInt(scanner), NotANumber.CheckInt(scanner)));
                }
                case 4 -> {
                    System.out.println("Please type wall length and pixel size :");
                    System.out.println(Thinkful.isDivisible(NotANumber.CheckInt(scanner), NotANumber.CheckInt(scanner)));
                }
                case 5 -> {
                    System.out.println("What is your name?");
                    System.out.println(JennysSecret.greet(NotAString.CheckString(scanner)));
                }
                case 6 -> {
                    System.out.println("This program can covert numbers to binary");
                    System.out.println("What is your number you want to convert?");
                    System.out.println(ConvertToBinary.toBinary(NotANumber.CheckInt(scanner)));
                }
                case 7 -> {
                    System.out.print("Put number of hours, minutes and seconds ");
                    System.out.println(BeginnerSeries.Past(NotANumber.CheckInt(scanner), NotANumber.CheckInt(scanner), NotANumber.CheckInt(scanner)));
                }
                case 8 -> {
                    System.out.print("Which year you want to transform to century : ");
                    System.out.println(CenturyFromYear.century(NotANumber.CheckInt(scanner)));
                }
                case 9 -> {
                    System.out.println("We can make from your number opposite!\nWhat is your number : ");
                    System.out.println(ReturnNegative.makeNegative(NotANumber.CheckInt(scanner)));
                }
                case 10 -> {
                    System.out.println("Everybody knows the classic \"half your age plus seven\" dating rule that a lot of people follow (including myself). It's the 'recommended' age range in which to date someone.\nWe can help you to count easily just put your age : ");
                    System.out.println(AgeRange.datingRange(NotANumber.CheckInt(scanner)));
                }
                case 11 -> {
                    System.out.println("Simple program to convert fahrenheit to celsius. Just put a temperature and we will tell you the truth : ");
                    System.out.println(Grasshopper.weatherInfo(scanner.nextDouble()));
                    System.out.println(Grasshopper.convertToCelsius(scanner.nextDouble()));
                }
            }

        } finally {
            FinallyMethod.finallyMethod(scanner);
        }
    }
}
