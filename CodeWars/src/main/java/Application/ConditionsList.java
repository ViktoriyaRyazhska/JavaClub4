package Application;

import Conditions.*;

import java.util.Scanner;

public class ConditionsList {
    public static String conditionsList() {
        String tasks =
                "1 - Opposite number\n" +
                        "2 - Is n divisible by x and y\n" +
                        "3 - Convert a boolean to a string\n" +
                        "4 - Do i get a bonus\n" +
                        "5 - How old will i be in 2099\n" +
                        "6 - Rock paper scissors\n" +
                        "7 - Basic mathematical operations\n" +
                        "8 - Opposites attract\n" +
                        "9 - Convert boolean values to strings yes or no\n" +
                        "10 - Will be enough space\n" +
                        "11 - The modulo 3 sequence\n" +
                        "12 - Switch it up\n" +
                        "13 - Thinkful logic drills traffic light\n" +
                        "14 - Transportation on vacation";
        return tasks;
    }

    public static void choiceConditions() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        try {
            switch (num) {
                default -> System.out.println("The is no such a task");
                case 1 -> {
                    int n = scanner.nextInt();
                    System.out.println(OppositeNumber.opposite(n));
                }
                case 2 -> {

                }
                case 3 -> {
                    Boolean b = scanner.nextBoolean();
                    System.out.println(BooleanToString.convert(b));
                }
                case 4 -> {
                    Boolean b = scanner.nextBoolean();
                    int n = scanner.nextInt();
                    System.out.println(DoIGetABonus.bonusTime(n, b));
                }
                case 5 -> {
                    int birth = scanner.nextInt();
                    int yearTo = scanner.nextInt();
                    System.out.println(HowOldIn2099.CalculateAge(birth, yearTo));
                }
                case 6 -> {
                    String p1 = scanner.next();
                    String p2 = scanner.next();
                    System.out.println(RockPaperScissors.rps(p1, p2));
                }
                case 7 -> {
                    String sign = scanner.next();
                    int v1 = scanner.nextInt();
                    int v2 = scanner.nextInt();
                    System.out.println(BasicOperations.basicMath(sign, v1, v2));
                }
                case 8 -> {
                    int fl1 = scanner.nextInt();
                    int fl2 = scanner.nextInt();
                    System.out.println(OppositeAttract.isLove(fl1, fl2));
                }
                case 9 -> {
                }
                case 10 -> {
                    int cap = scanner.nextInt();
                    int in = scanner.nextInt();
                    int wait = scanner.nextInt();
                    System.out.println(WillBeEnoughSpace.enough(cap, in, wait));
                }
                case 11 -> {
                    break;
                }
                case 12 -> {
                    int numm = scanner.nextInt();
                    System.out.println(SwitchItUp.switchItUp(numm));
                }
                case 13 -> {
                    String string = scanner.next();
                    TrafficLight.updateLight(string);
                }
                case 14 -> {
                    int days = scanner.nextInt();
                    System.out.println(TransportationVacation.rentalCarCost(days));
                }
            }
        }finally {
            FinallyMethod.finallyMethod(scanner);
        }
    }
}
