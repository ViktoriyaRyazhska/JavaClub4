package Application;

import Errors.NotANumber;

import java.util.Scanner;

public class StringList {
    public static String stringList() {
        String tasks =
                "1 - Convert a number to a string\n" +
                        "2 - Reversed strings\n" +
                        "3 - Welcome-to-the-city\n" +
                        "4 - Opposite-number\n" +
                        "5 - Fixme-replace-all-dots\n" +
                        "6 - Are-you-playing-banjo\n" +
                        "7 - Remove-string-spaces\n" +
                        "8 - Triple-trouble-2\n" +
                        "9 - Find-the-position\n" +
                        "10 - Fake-binary\n" +
                        "11 - Parse-nice-int-from-char-problem\n" +
                        "12 - Grasshopper-debug\n" +
                        "13 - Abbreviate-a-two-word-name\n" +
                        "14 - All-star-code-challenge-number-18\n" +
                        "15 - Sort-and-star\n" +
                        "16 - Correct-the-mistakes-of-the-character-recognition-software\n" +
                        "17 - Alternating-case-<-equals->-alternating-case\n" +
                        "18 - Exclamation-marks-series-number-6-remove-n-exclamation-marks-in-the-sentence-from-left-to-right";
        return tasks;
    }

    public static void choiceString() {
        Scanner scanner = new Scanner(System.in);
        int num = NotANumber.CheckInt(scanner);
        switch (num) {
            default -> System.out.println("The is no such a task");
            case 1 -> {
                int n = NotANumber.CheckInt(scanner);

            }
            case 2 -> {
                break;
            }
            case 3 -> {
                break;
            }
            case 4 -> {
                break;
            }
            case 5 -> {
                break;
            }
            case 6 -> {
                break;
            }
            case 7 -> {
                break;
            }
            case 8 -> {
                break;
            }
            case 9 -> {
                break;
            }
            case 10 -> {
                break;
            }
            case 11 -> {
                break;
            }
            case 12 -> {
                break;
            }
            case 13 -> {
                break;
            }
            case 14 -> {
                break;
            }
            case 15 -> {
                break;
            }
        }
    }
}
