package application.utility;

import application.tasks.loops.*;

import java.util.Scanner;

public class ChoiceLoops extends Constants {
    private static void choiceLoops(Scanner scanner) {
        System.out.println(listOfLoops());
        System.out.print("Select an option:\n> ");
        switch (scanner.nextInt()) {
            default:
                System.out.println("Sorry.. this option don`t exist");
                break;
            case EXIT:
                break;
            case BACK:
                ChoiceList.choiceList();
                break;
            case 1:
                GapInPrimes.task(scanner);
                ChoiceLoops.choiceLoops(scanner);
                break;
            case 2:
                NearestSquare.task(scanner);
                ChoiceLoops.choiceLoops(scanner);
                break;
            case 3:
                SticksGame.task(scanner);
                ChoiceLoops.choiceLoops(scanner);
                break;
            case 4:
                Summation.task(scanner);
                ChoiceLoops.choiceLoops(scanner);
                break;
            case 5:
                TwiceAsOld.task(scanner);
                ChoiceLoops.choiceLoops(scanner);
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
