
import Implementation.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        boolean flagExit = false;

        while (!flagExit) {
            System.out.println("------------------------");
            System.out.println("|-Codewars task solver-|");
            System.out.println("------------------------");
            System.out.println("""
                    |---Chose task type--- |
                    |1.Basic program       |
                    |2.Classes             |
                    |3.Conditions          |
                    |4.Loops               |
                    |5.OOP                 |
                    |6.String              |
                    |7.Collections         |
                    |0.Exit                |""");
            System.out.println("------------------------");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("\n--------------------" +
                            "-----------------------------");
                    System.out.println("|\t\t\t\t-Basic program-\t\t\t\t\t|");
                    System.out.println("-----------------------" +
                            "--------------------------");
                    System.out.println("""
                            |\t\t\t\t---Chose task---\t\t\t\t|
                            |1.Double integer\t\t\t\t\t\t\t\t|
                            |2.Multiplying two numbers\t\t\t\t\t\t|
                            |3.Volume of a cuboid\t\t\t\t\t\t\t|
                            |4.Thinkful number drills pixelart planning\t\t|
                            |5.Jenny's secret message\t\t\t\t\t\t|
                            |6.Convert to binary\t\t\t\t\t\t\t|
                            |7.Beginner series number 2 clock\t\t\t\t|
                            |8.Century from year\t\t\t\t\t\t\t|
                            |9.Return negative\t\t\t\t\t\t\t\t|
                            |10.Age range compatibility equation\t\t\t|
                            |11.Celsius converter\t\t\t\t\t\t\t|
                            |0.Back\t\t\t\t\t\t\t\t\t\t\t|""");
                    System.out.println("--------------------" +
                            "-----------------------------");
                    choice = scanner.nextInt();
                    switch (choice) {
                        case 0 -> mainMenu();
                        case 1 -> BasicImpl.DoubleInteger(scanner);
                        case 2 -> BasicImpl.MultiplyingTwoNumbers(scanner);
                        case 3 -> BasicImpl.VolumeOfACuboid(scanner);
                        case 4 -> BasicImpl.ThinkfulNumberDrillsPixelartPlanning(scanner);
                        case 5 -> BasicImpl.JennysSecretMessage(scanner);
                        case 6 -> BasicImpl.ConvertToBinary(scanner);
                        case 7 -> BasicImpl.Clock(scanner);
                        case 8 -> BasicImpl.CenturyFromYear(scanner);
                        case 9 -> BasicImpl.ReturnNegative(scanner);
                        case 10 -> BasicImpl.AgeRangeCompatibilityEquation(scanner);
                        case 11 -> BasicImpl.CelsiusConverter(scanner);
                        default -> throw new IllegalArgumentException("Incorrect value!");
                    }
                }
                case 2 -> {
                    System.out.println("\n-------------------" +
                            "--------------");
                    System.out.println("|\t\t\t-Classes-\t\t\t|");
                    System.out.println("-------------------" +
                            "--------------");
                    System.out.println("""
                            |\t\t---Chose task---\t\t|
                            |1.Lombok encapsulation\t\t\t|
                            |2.Static electrickery\t\t\t|
                            |3.Two fighters one winner\t\t|
                            |4.Building blocks\t\t\t\t|
                            |5.Fractions class\t\t\t\t|
                            |6.Simple drawing board\t\t\t|
                            |0.Back\t\t\t\t\t\t\t|""");
                    System.out.println("-------------------" +
                            "--------------");
                    choice = scanner.nextInt();
                    switch (choice) {
                        case 0 -> mainMenu();
                        case 1 -> ClassesImpl.encapsulation(scanner);
                        case 2 -> ClassesImpl.StaticElectrickery(scanner);
                        case 3 -> ClassesImpl.twoFighters(scanner);
                        case 4 -> ClassesImpl.buildingBlocks(scanner);
                        case 5 -> ClassesImpl.doFraction(scanner);
                        case 6 -> ClassesImpl.Canvas(scanner); //WIP
                        default -> throw new IllegalArgumentException("Incorrect value!");
                    }
                }
                case 3 -> {
                    System.out.println("\n----------------------" +
                            "-------------------------------");
                    System.out.println("|\t\t\t\t\t-Conditions-\t\t\t\t\t|");
                    System.out.println("---------------------" +
                            "--------------------------------");
                    System.out.println("""
                            |\t\t\t\t---Chose task---\t\t\t\t\t|
                            |1.Opposite number\t\t\t\t\t\t\t\t\t|
                            |2.Is n divisible by x and y\t\t\t\t\t\t|
                            |3.Convert a boolean to a string\t\t\t\t\t|
                            |4.Do i get a bonus\t\t\t\t\t\t\t\t\t|
                            |5.How old will i be in 2099\t\t\t\t\t\t|
                            |6.Rock paper scissors\t\t\t\t\t\t\t\t|
                            |7.Basic mathematical operations\t\t\t\t\t|
                            |8.Opposites attract\t\t\t\t\t\t\t\t|
                            |9.Convert boolean values to strings yes or no\t\t|
                            |10.Will there be enough space\t\t\t\t\t\t|
                            |11.The modulo 3 sequence\t\t\t\t\t\t\t|
                            |12.Switch it up\t\t\t\t\t\t\t\t\t|
                            |13.Thinkful logic drills traffic light\t\t\t\t|
                            |14.Transportation on vacation\t\t\t\t\t\t|
                            |0.Back\t\t\t\t\t\t\t\t\t\t\t\t|""");
                    System.out.println("---------------------" +
                            "--------------------------------");
                    choice = scanner.nextInt();
                    switch (choice) {
                        case 0 -> mainMenu();
                        case 1 -> ConditionsImpl.oppositeNumber(scanner);
                        case 2 -> ConditionsImpl.DivisibleByXAndY(scanner);
                        case 3 -> ConditionsImpl.boolenToStr(scanner);
                        case 4 -> ConditionsImpl.getBonus(scanner);
                        case 5 -> ConditionsImpl.countAgeDiff(scanner);
                        case 6 -> ConditionsImpl.rps(scanner);
                        case 7 -> ConditionsImpl.BasicOperations(scanner);
                        case 8 -> ConditionsImpl.oppositesAttract(scanner);
                        case 9 -> ConditionsImpl.YesOrNo(scanner);
                        case 10 -> ConditionsImpl.isThereEnoughSpace(scanner);
                        case 11 -> ConditionsImpl.sequence(scanner);
                        case 12 -> ConditionsImpl.SwitchItUp(scanner);
                        case 13 -> ConditionsImpl.traffic(scanner);
                        case 14 -> ConditionsImpl.CarCost(scanner);
                        default -> throw new IllegalArgumentException("Incorrect value!");
                    }
                }
                case 4 -> {
                    System.out.println("\n---------------------------------");
                    System.out.println("|\t\t\t-Loops-\t\t\t\t|");
                    System.out.println("---------------------------------");
                    System.out.println("""
                            |       ---Chose task---        |
                            |1.String repeat                |
                            |2.Cat years dog years          |
                            |3.Get the mean of an array     |
                            |4.Beginner lost without a map  |
                            |5.Counting sheep dot dot dot   |
                            |6.Reversed sequence            |
                            |7.How good are you really      |
                            |8.Beginner reduce but grow     |
                            |9.Sum of positive              |
                            |10.My head is at the wrong end |
                            |11.Twice as old                |
                            |12.Find nearest square number  |
                            |13.Grasshopper summation       |
                            |14.Gap in primes               |
                            |15.21 sticks                   |
                            |0.Back                         |""");
                    System.out.println("---------------------------------");
                    choice = scanner.nextInt();
                    switch (choice) {
                        case 0 -> mainMenu();
                        case 1 -> LoopsImpl.repeatString(scanner);
                        case 2 -> LoopsImpl.humanYearsCatYearsDogYears(scanner);
                        case 3 -> LoopsImpl.MeanOfAnArray(scanner);
                        case 4 -> LoopsImpl.maps(scanner);
                        case 5 -> LoopsImpl.Sheeps(scanner);
                        case 6 -> LoopsImpl.doSequence(scanner);
                        case 7 -> LoopsImpl.getAverage(scanner);
                        case 8 -> LoopsImpl.ReduceButGrow(scanner);
                        case 9 -> LoopsImpl.sumOfPositive(scanner);
                        case 10 -> LoopsImpl.TailToHead(scanner);
                        case 11 -> LoopsImpl.twiceAsOld(scanner);
                        case 12 -> LoopsImpl.nearestSq(scanner);
                        case 13 -> LoopsImpl.GrassHopper(scanner);
                        case 14 -> LoopsImpl.gapInPr(scanner);
                        case 15 -> LoopsImpl.TheGame(scanner);
                        default -> throw new IllegalArgumentException("Incorrect value!");
                    }
                }
                case 5 -> {
                    System.out.println("\n---------------------------------");
                    System.out.println("|\t\t\t-OOP-\t\t\t\t|");
                    System.out.println("---------------------------------");
                    System.out.println("""
                            |       ---Chose task---        |
                            |1.Basic subclasses adam and eve|
                            |2.Rotations and reflections i  |
                            |3.Leetspeak                    |
                            |4.Tdd area calculations        |
                            |0.Back                         |""");
                    System.out.println("---------------------------------");
                    choice = scanner.nextInt();
                    switch (choice) {
                        case 0 -> mainMenu();
                        case 1 -> OopImpl.createHuman(scanner);
                        case 2 -> OopImpl.Dih4(scanner); //WIP
                        case 3 -> OopImpl.Leetspeak(scanner);
                        case 4 -> OopImpl.calcShape(scanner);
                        default -> throw new IllegalArgumentException("Incorrect value!");
                    }
                }
                case 6 -> {
                    System.out.println("\n------------------------" +
                            "-------------------------");
                    System.out.println("|\t\t\t\t\t-String-\t\t\t\t\t|");
                    System.out.println("--------------------------" +
                            "-----------------------");
                    System.out.println("""
                            |               ---Chose task---                |
                            |1.Convert a number to a string                 |
                            |2.Reversed strings                             |
                            |3.Welcome to the city                          |
                            |4.Opposite number                              |
                            |5.Fixme replace all dots                       |
                            |6.Are you playing banjo                        |
                            |7.Remove string spaces                         |
                            |8.Triple trouble 2                             |
                            |9.Find the position                            |
                            |10.Fake binary                                 |
                            |11.Parse nice int from char problem            |
                            |12.Grasshopper debug                           |
                            |13.Abbreviate a two word name                  |
                            |14.Accepts string and count doubles            |
                            |   of letters                                  |
                            |15.Sort and star                               |
                            |16.Correct the mistakes of the character       |
                            |   recognition software                        |
                            |17.Alternating case                            |
                            |18.Exclamation marks series number 6 remove n  |
                            |   exclamation marks in the sentence from left |
                            |   to right                                    |
                            |0.Back                                         |""");
                    System.out.println("--------------------------" +
                            "-----------------------");
                    choice = scanner.nextInt();
                    switch (choice) {
                        case 0 -> mainMenu();
                        case 1 -> StringImpl.ConvertANumber(scanner);
                        case 2 -> StringImpl.reverseString(scanner);
                        case 3 -> StringImpl.sayHello(scanner);
                        case 4 -> StringImpl.OppositeNumber(scanner);
                        case 5 -> StringImpl.replase(scanner);
                        case 6 -> StringImpl.PlaysBanjo(scanner);
                        case 7 -> StringImpl.removeStringSpaces(scanner);
                        case 8 -> StringImpl.tripleTrouble(scanner);
                        case 9 -> StringImpl.FindThePosition(scanner);
                        case 10 -> StringImpl.fakeBinary(scanner);
                        case 11 -> StringImpl.OldShe(scanner);
                        case 12 -> StringImpl.grassHopper(scanner);
                        case 13 -> StringImpl.abbrevName(scanner);
                        case 14 -> StringImpl.AllStarCodeChallenge(scanner);
                        case 15 -> StringImpl.sortAndStar(scanner);
                        case 16 -> StringImpl.NiceString(scanner);
                        case 17 -> StringImpl.alternativeCase(scanner);
                        case 18 -> StringImpl.remove(scanner);
                        default -> throw new IllegalArgumentException("Incorrect value!");
                    }
                }
                case 7 -> {
                    System.out.println("\n--------------------" +
                            "----------------------");
                    System.out.println("|\t\t\t-Collections-\t\t\t\t |");
                    System.out.println("----------------------" +
                            "--------------------");
                    System.out.println("""
                            |           ---Chose task---             |
                            |1.Push a hash slash an object into array|
                            |2.Unfinished loop bug fixing number 1   |
                            |3.Filtering even numbers bug fixes      |
                            |4.Interactive dictionary                |
                            |0.Back                                  |""");
                    System.out.println("----------------------" +
                            "--------------------");
                    choice = scanner.nextInt();
                    switch (choice) {
                        case 0 -> mainMenu();
                        case 1 -> CollectionsImpl.PushAnObjectIntoArray(scanner);
                        case 2 -> CollectionsImpl.createL(scanner);
                        case 3 -> CollectionsImpl.FixTheBug(scanner);
                        case 4 -> CollectionsImpl.Dictionary(scanner); // WIP
                        default -> throw new IllegalArgumentException("Incorrect value!");
                    }
                }
                case 0 -> flagExit = true;
                default -> throw new IllegalArgumentException("Incorrect value!");
            }
            if (!flagExit){
                System.out.println("Press Any Key To Continue...");
                new java.util.Scanner(System.in).nextLine();
            }
        }
    }
}
