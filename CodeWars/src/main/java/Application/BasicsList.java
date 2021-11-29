package Application;

import BasicProgram.*;

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
        int num = scanner.nextInt();
        try {
            switch (num) {
                default -> {
                    System.out.println("The is no such a task");
                }
                case 1 -> {
                    System.out.println("We can double the integer and return it.");
                    System.out.print("What is your number: ");
                    System.out.println("Result = " + UCantCode.doubleInteger(scanner.nextInt()));
                }
                case 2 -> {
                    System.out.println("We can multiply two number. Please type your numbers");
                    System.out.println("Your number is: ");
                    System.out.println(Function3.multiply(scanner.nextInt(), scanner.nextInt()));
                }
                case 3 -> {
                    System.out.println("Here is a program in which we can count volume cuboid");
                    System.out.println("Type parameters of cuboid");
                    System.out.println(VolumeOfCuboid.getVolume(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
                }
                case 4 -> {
                    System.out.println("Please type wall length and pixel size :");
                    System.out.println(Thinkful.isDivisible(scanner.nextInt(), scanner.nextInt()));
                }
                case 5 -> {
                    System.out.println("What is your name?");
                    System.out.println(JennysSecret.greet(scanner.next()));
                }
                case 6 -> {
                    System.out.println("This program can covert numbers to binary");
                    System.out.println("What is your number you want to convert?");
                    System.out.println(ConvertToBinary.toBinary(scanner.nextInt()));
                }
                case 7 -> {
                    System.out.println(BeginnerSeries.Past(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
                }
                case 8 -> {
                    System.out.println(CenturyFromYear.century(scanner.nextInt()));
                }
                case 9 -> {
                    System.out.println(ReturnNegative.makeNegative(scanner.nextInt()));
                }
                case 10 -> {
                    System.out.println(AgeRange.datingRange(scanner.nextInt()));
                }
                case 11 -> {
                    System.out.println(Grasshopper.weatherInfo(scanner.nextDouble()));
                    System.out.println(Grasshopper.convertToCelsius(scanner.nextDouble()));
                }
            }

        } finally {
            FinallyMethod.finallyMethod(scanner);
            }
        }
    }
