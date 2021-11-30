package application.tasks.string;

import java.util.Scanner;

public class CorrectTheMistakes {
    public static String correct(String string) {
        StringBuilder builder = new StringBuilder();

        String[] array = string.split("");
       //loop to separate
        for (String letter : array) {
           //loop  to check
            switch (letter) {
                case "5":
                    letter = "S";
                    break;
                case "0":
                    letter = "O";
                    break;
                case "1":
                    letter = "I";
            }
            //adding back
            builder.append(letter);
        }
        return builder.toString();
    }

    public String getCorrect(String string) {
        return correct(string);
    }

    public static void task(Scanner in) {
        in.nextLine();
        System.out.println("Enter sentence to check for the mistakes character recondition software made: ");
        String checkMistakes = in.nextLine();
        System.out.print("Sentence after corrections: ");
        System.out.println(correct(checkMistakes));
    }
}
