package Application;

import Errors.NotANumber;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

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
        try {
            switch (num) {
                default -> System.out.println("The is no such a task");
                case 1 -> {
                    System.out.print("Enter your number: ");
                    int n = NotANumber.CheckInt(scanner);
                    String str = String.valueOf(n);
                    System.out.println("Your converted result: " + str);

                }
                case 2 -> {
                    System.out.print("Enter your number: ");
                    String str = scanner.nextLine();
                    String result = new StringBuilder(str).reverse().toString();
                    System.out.println("The reversed result: " + result);
                }
                case 3 -> {
                    String[] name = new String[]{"Victor", "Tikor"};
                    System.out.println("Your default name is " + name[0] + " " + name[1]);
                    System.out.print("Enter state: ");
                    String state = scanner.nextLine();
                    System.out.print("Enter city: ");
                    String city = scanner.nextLine();
                    String temp = "Hello, %s! Welcome to %s, %s!\n";
                    System.out.printf(temp, String.join(" ", name), city, state);
                }
                case 4 -> {
                    System.out.print("Enter your number: ");
                    int n = NotANumber.CheckInt(scanner);
                    int negativeN = -n;
                    System.out.println("The opposite number is " + negativeN);
                }
                case 5 -> {
                    System.out.print("Enter a sentence using the '.': ");
                    String str = scanner.nextLine();
                    System.out.println(str.replace(".", "-"));
                }
                case 6 -> {
                    System.out.print("Enter your name: ");
                    String name = scanner.nextLine();
                    char[] arr = name.toCharArray();
                    name += (Character.toLowerCase(arr[0]) == 'r') ?
                            " plays banjo" : " does not play banjo";
                    System.out.println(name);
                }
                case 7 -> {
                    System.out.print("Enter string using ' ': ");
                    String str = scanner.nextLine();
                    System.out.println(str.replace(" ", ""));
                }
                case 8 -> {
                    System.out.print("First string: ");
                    String one = scanner.nextLine();
                    System.out.print("Second string: ");
                    String two = scanner.nextLine();
                    System.out.print("Third string: ");
                    String three = scanner.nextLine();
                    StringBuilder builder = new StringBuilder();
                    for (int i = 0; i < one.length(); i++)
                        builder.append(one.charAt(i)).append(two.charAt(i)).append(three.charAt(i));
                    System.out.println(builder);
                }
                case 9 -> {
                    char alphabet = 'c';
                    System.out.println("Your char is 'c'");
                    System.out.println("Position of alphabet: " + (alphabet - 96));
                }
                case 10 -> {
                    System.out.print("Enter fake binary string: ");
                    String numberString = scanner.nextLine();
                    String result = numberString.chars()
                            .mapToObj(x -> (x < '5') ? "0" : "1")
                            .reduce("", String::concat);
                    System.out.println("The result is: " + result);

                }
                case 11 -> {
                    System.out.print("Enter string that starts with a number: ");
                    String herOld = scanner.nextLine();
                    int x = Integer.parseInt(String.valueOf(herOld.charAt(0)));
                    System.out.println("The result is: \n" + x);
                }
                case 12 -> {
                    System.out.print("Enter the temperature: ");
                    int temperature = NotANumber.CheckInt(scanner);
                    ;
                    String result = "";
                    double c = (temperature - 32) * (5.0 / 9);
                    if (c > 0)
                        result += (c + " is above freezing temperature");
                    else
                        result += (c + " is freezing temperature");
                    System.out.println("Result:\n  " + result);
                }
                case 13 -> {
                    System.out.print("Enter your name: ");
                    String name = scanner.nextLine();
                    ;
                    String result = Arrays.stream(name.toUpperCase().split(" "))
                            .map(x -> x.substring(0, 1))
                            .collect(Collectors.joining("."));
                    System.out.println("Result:\n  " + result);
                }
                case 14 -> {
                    System.out.print("Enter a random sentence: ");

                    String str = scanner.nextLine();
                    char letter = str.charAt(0);

                    int result = (int) str.chars()
                            .mapToObj(x -> (char) x)
                            .filter(x -> x.equals(letter))
                            .count();
                    System.out.println("Character " + letter + " appears " + result + " times.");
                }
                case 15 -> {
                    String[] s = {"asdasdas", "asdasd", "asdfasdas", "sda"};
                    System.out.println(Arrays.toString(s) + " your default array");
                    String result = String.join("***",
                            Arrays.stream(s).sorted().findFirst().orElse("").split(""));
                    System.out.println("Result:\n  " + result);
                }
                case 16 -> {
                    System.out.print("Enter a random sentence using S, O or I: ");
                    String string = scanner.nextLine();

                    String result = string.replace("5", "S")
                            .replace("0", "O")
                            .replace("1", "I");
                    System.out.println("Result\n  " + result);
                }
                case 17 -> {
                    System.out.print("Enter a random sentence using: ");
                    String string = scanner.nextLine();
                    String result = string.chars()
                            .mapToObj(y -> (char) y)
                            .map(y -> Character.isUpperCase(y) ? Character.toLowerCase(y) : Character.toUpperCase(y))
                            .map(String::valueOf)
                            .reduce("", String::concat);
                    System.out.println("Result:\n  " + result);
                }
                case 18 -> {
                    System.out.print("Enter your number: ");
                    int n = NotANumber.CheckInt(scanner);
                    System.out.print("Enter a random sentence using '!': ");
                    String s = scanner.nextLine();
                    String result = String.join("", s.split("!", n + 1));
                    System.out.println("Result:\n " + result);
                }
            }
        }finally {
            FinallyMethod.finallyMethod(scanner);
        }
    }
}
