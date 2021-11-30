package Application;

import Errors.NotANumber;
import Errors.NotAString;
import Loops.*;

import java.util.Arrays;
import java.util.Scanner;

public class LoopsList {
    public static String loopsList() {
        String tasks =
                "1 - String repeat\n" +
                        "2 - Cat years dog years\n" +
                        "3 - Get the mean of an array\n" +
                        "4 - Beginner lost without a map\n" +
                        "5 - Counting sheep dot-dot-dot\n" +
                        "6 - Reversed sequence\n" +
                        "7 - How good are you really\n" +
                        "8 - Beginner reduce but grow\n" +
                        "9 - Sum of positive\n" +
                        "10 - My head is at the wrong end\n" +
                        "11 - Twice as old\n" +
                        "12 - Find nearest square number\n" +
                        "13 - Grasshopper summation\n" +
                        "14 - Gap in primes\n" +
                        "15 - 21 sticks";
        return tasks;
    }

    public static void choiceLoops() {
        Scanner scanner = new Scanner(System.in);
        int num = NotANumber.CheckInt(scanner);
        try {
            switch (num) {
                default -> {
                    System.out.println("The is no such a task");
                }
                case 1 -> {
                    int repeat = NotANumber.CheckInt(scanner);
                    String string = NotAString.CheckString(scanner);
                    System.out.println(StringRepeat.repeatStr(repeat, string));
                }
                case 2 -> {
                    System.out.println("How old are u?");
                    int age = NotANumber.CheckInt(scanner);
                    CatYearsDog.humanYearsCatYearsDogYears(age);
                }
                case 3 -> {
                    int arrayNumber = NotANumber.CheckInt(scanner);
                    int[] marks = new int[arrayNumber];
                    for (int i = 0; i < arrayNumber; i++) {
                        marks[i] = NotANumber.CheckInt(scanner);
                    }
                    System.out.println(GetTheMeanOfAnArray.getAverage(marks));
                }
                case 4 -> {
                    int arrayNumber = NotANumber.CheckInt(scanner);
                    int[] map = new int[arrayNumber];
                    for (int i = 0; i < arrayNumber; i++) {
                        map[i] = NotANumber.CheckInt(scanner);
                    }
                    System.out.println(Arrays.toString(LostWithoutMap.map(map)));
                }
                case 5 -> {
                    CountingSheep countingSheep = new CountingSheep();
                    int countTrue = NotANumber.CheckInt(scanner);
                    int countFalse = NotANumber.CheckInt(scanner);
                    Boolean[] b = new Boolean[countFalse + countTrue];
                    for (int i = 0; i < b.length; i++) {
                        if (i < countTrue) {
                            b[i] = true;
                        } else {
                            b[i] = false;
                        }
                    }
                    System.out.println(countingSheep.countSheeps(b));
                }
                case 6 -> {
                    int Number = NotANumber.CheckInt(scanner);
                    System.out.println(Arrays.toString(ReversedSequence.reverse(Number)));
                }
                case 7 -> {
                    int UrPoint = NotANumber.CheckInt(scanner);
                    int numOfMarks = NotANumber.CheckInt(scanner);
                    int[] marks = new int[numOfMarks];
                    for (int i = 0; i < numOfMarks; i++) {
                        marks[i] = NotANumber.CheckInt(scanner);
                    }
                    System.out.println(HowGoodAreU.betterThanAverage(marks, UrPoint));
                }
                case 8 -> {
                    int arrNum = NotANumber.CheckInt(scanner);
                    int[] s = new int[arrNum];
                    for (int i = 0; i < s.length; i++) {
                        s[i] = NotANumber.CheckInt(scanner);
                    }
                    System.out.println(ReduceButGrow.grow(s));
                }
                case 9 -> {
                    int arrNum = NotANumber.CheckInt(scanner);
                    int[] s = new int[arrNum];
                    for (int i = 0; i < s.length; i++) {
                        s[i] = NotANumber.CheckInt(scanner);
                    }
                    System.out.println(SumOfPositive.sum(s));
                }
                case 10 -> {
                    int arrNum = NotANumber.CheckInt(scanner);
                    String[] s = new String[arrNum];
                    for (int i = 0; i < s.length; i++) {
                        s[i] = NotAString.CheckString(scanner);
                    }
                    System.out.println(Arrays.toString(MyHeadIsAtTheWrongEnd.fixTheMeerkat(s)));
                }
                case 11 -> {
                    int dadYears = NotANumber.CheckInt(scanner);
                    int sonYears = NotANumber.CheckInt(scanner);
                    System.out.println(TwiceAsOld.TwiceAsOld(dadYears, sonYears));
                    break;
                }
                case 12 -> {
                    int n = NotANumber.CheckInt(scanner);
                    System.out.println(FindNearestSquare.nearestSq(n));
                }
                case 13 -> {
                    int n = NotANumber.CheckInt(scanner);
                    System.out.println(Summation.summation(n));
                }
                case 14 -> {
                    int n = NotANumber.CheckInt(scanner);
                    long l = scanner.nextLong();
                    long i = scanner.nextLong();
                    GapInPrimes.gap(n, l, i);
                }
                case 15 -> {

                }
            }
        }finally {
            FinallyMethod.finallyMethod(scanner);
        }
    }
}
