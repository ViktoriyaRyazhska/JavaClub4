package application.tasks.conditions;

import application.utility.ChoiceConditions;

import java.util.HashMap;
import java.util.Scanner;

import static java.lang.System.exit;

public class SwitchItUp {
    private static String switchItUp(int number, HashMap<Integer, String> map) {
        return map.get(number);
    }

    private static HashMap<Integer, String> map() {
        HashMap<Integer, String> map = new HashMap<>() {{
            put(0, "Zero");
            put(1, "One");
            put(2, "Two");
            put(3, "Three");
            put(4, "Four");
            put(5, "Five");
            put(6, "Six");
            put(7, "Seven");
            put(8, "Eight");
            put(9, "Nine");
            put(10, "Ten");
        }};
        return map;
    }

    private static void validate(int number,Scanner in) {
        boolean isValid = false;
        while (!isValid) {
            if (!(number >= 0 && number <= 9)) {
                System.out.println("Try again! Integer must be between 0 and 9");
                SwitchItUp.task(in);
            } else
                isValid = true;
        }
    }

    public static void task(Scanner in) {
        System.out.println("Enter an integer between 0-9\n > ");
        int number = in.nextInt();
        validate(number, in);
        System.out.println(switchItUp(number, map()));
        System.out.println("Do you want to play again?(1-yes, any other key - no)");
        in.nextLine();
        String playAgain = in.nextLine();
        if (playAgain.equals("1"))
            SwitchItUp.task(in);
        else
            ChoiceConditions.choiceConditions(in);
    }


    public HashMap<Integer, String> getMap() {
        return map();
    }

    public String getSwitchItUp(int number, HashMap<Integer, String> map) {
        return switchItUp(number, map);
    }
}
