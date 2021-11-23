package application.utility;

import application.tasks.loops.*;

import java.util.Scanner;

public class ChoiceLoops extends Constants {
    public static void choiceLoops() {
        Scanner in = new Scanner(System.in);
        System.out.println(listOfLoops());
        System.out.print("Select an option:\n> ");
        int option = in.nextInt();

        switch (option) {
            default:
                System.out.println("Sorry.. this option don`t exist");
                ChoiceLoops.choiceLoops();
                break;
            case EXIT:
                break;
            case BACK:
                ChoiceList.choiceList();
                break;
            case 1:
                GapInPrimes.task();
                ChoiceLoops.choiceLoops();
                break;
            case 2:
                NearestSquare.task();
                ChoiceLoops.choiceLoops();
                break;
            case 3:
                SticksGame.task();
                ChoiceLoops.choiceLoops();
                break;
            case 4:
                Summation.task();
                ChoiceLoops.choiceLoops();
                break;
            case 5:
                TwiceAsOld.task();
                ChoiceLoops.choiceLoops();
                break;
        }
    }
    private static String listOfLoops() {
        String loops = "\nList of of loops task:\n" +
                "-1. Back\n" +
                "0. Exit\n" +
                "1. Find prime numbers with gap\n" +
                "2. Find nearest square number\n" +
                "3. Game '21 Sticks' with robot\n" +
                "4. Find factorial\n" +
                "5. Father is twice as old as his son";

        return loops;
    }
}
