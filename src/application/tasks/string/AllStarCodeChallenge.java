package application.tasks.string;

import java.util.Scanner;

public class AllStarCodeChallenge {
    private static int strCount(String str, char letter) {
        String array[] = str.split("");
        int count = 0;
        for (String letterArr : array) {
            if (letterArr.charAt(0) == letter)
                count++;
        }
        return count;
    }

    public int getStrCount(String str, char letter) {
        return strCount(str, letter);
    }

    public static void task(Scanner in) {
        in.nextLine();
        System.out.println("Enter any word:");
        String word = in.nextLine();
        System.out.println("Enter a char you want to count in the \"" + word + "\" word:");
        char letter = in.next().charAt(0);
        System.out.println("In \"" + word + "\" are(is) " + strCount(word, letter) + "  letter(s) of the letter \"" + letter + "\".");

    }
}
