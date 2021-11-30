package application.tasks.string;

import java.util.Arrays;
import java.util.Scanner;

public class SortAndStar {
    private static String twoSort(String[] s) {
        //sorting alphabetically
        for (int i = 0; i < s.length; i++) {
            for (int j = i + 1; j < s.length; j++) {
                if (s[i].compareTo(s[j]) > 0) {
                    String temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
        //split and adding *** between letters
        String firstWord = Arrays.stream(s).findFirst().get();
        String[] array = firstWord.split("");
        StringBuilder builder = new StringBuilder();
        int n = 0;
        for (String letter : array) {
            n++;
            if (array.length > n) {
                builder.append(letter + "***");
            } else
                builder.append(letter);
        }
        return builder.toString();
    }

    public String getTwoSort(String[] s) {
        return twoSort(s);
    }

    public static void task(Scanner in) {

        int n;
        System.out.println("Enter the number of elements ");
        n = in.nextInt();
        in.nextLine();
        String s[] = new String[n];


        for (int i = 0; i < n; i++) {
            System.out.println("Enter the String: ");
            s[i] = in.nextLine();
        }
        System.out.println("The very first word: "+twoSort(s));
    }
}
