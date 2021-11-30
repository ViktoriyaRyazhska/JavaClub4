package application.utility;

import application.tasks.loops.*;

import java.util.Scanner;

public class ChoiceLoops extends Constants {
    public static void choiceLoops(Scanner scanner) {
        System.out.println(listOfLoops());
        System.out.print("\nSelect an option:\n> ");
        int option = scanner.nextInt();

        switch (option) {
            default:
                System.out.println("Sorry.. this option don`t exist");
                break;
            case EXIT:
                break;
            case BACK:
                ChoiceList.choiceList(scanner);
                break;
            case 1:
                //BeginnerLost.task(scanner);
                ChoiceLoops.choiceLoops(scanner);
                break;
            case 2:
                //CatYearsDogYears.task(scanner);
                ChoiceLoops.choiceLoops(scanner);
                break;
            case 3:
                //CountingSheep.task(scanner);
                ChoiceLoops.choiceLoops(scanner);
                break;
            case 4:
                GapInPrimes.task(scanner);
                ChoiceLoops.choiceLoops(scanner);
                break;
            case 5:
                //GetTheMean.task(scanner);
                ChoiceLoops.choiceLoops(scanner);
                break;
            case 6:
                HowGoodAreYou.task(scanner);
                ChoiceLoops.choiceLoops(scanner);
                break;
            case 7:
                MyHeadIsAtTheWrongEnd.task(scanner);
                ChoiceLoops.choiceLoops(scanner);
                break;
            case 8:
                NearestSquare.task(scanner);
                ChoiceLoops.choiceLoops(scanner);
                break;
            case 9:
                ReduceButGrow.task(scanner);
                ChoiceLoops.choiceLoops(scanner);
                break;
            case 10:
                ReversedSequence.task(scanner);
                ChoiceLoops.choiceLoops(scanner);
                break;
            case 11:
                SticksGame.task(scanner);
                ChoiceLoops.choiceLoops(scanner);
                break;
            case 12:
                //StringRepeat.task(scanner);
                ChoiceLoops.choiceLoops(scanner);
                break;
            case 13:
                Summation.task(scanner);
                ChoiceLoops.choiceLoops(scanner);
                break;
            case 14:
                SumOfPositive.task(scanner);
                ChoiceLoops.choiceLoops(scanner);
                break;
            case 15:
                TwiceAsOld.task(scanner);
                ChoiceLoops.choiceLoops(scanner);
                break;

        }
    }
    private static String listOfLoops() {
        String loops = "\nList of of loops task:\n" +
                "-1. Back\n" +
                "0. Exit\n" +
                "1. Beginner Lost\n" +
                "2. Cat Years, Dog years\n" +
                "3. Counting Sheep\n" +
                "4. Gap in Primes\n" +
                "5. Get the mean\n" +
                "6. How Good are You\n" +
                "7. My Headls at the Wrong End\n" +
                "8. Nearest Square\n" +
                "9. Reduce but Grow\n" +
                "10. Reversed Sequence\n" +
                "11. Sticks Game\n" +
                "12. String Repeat\n" +
                "13. Summation\n" +
                "14. Sum of positive\n" +
                "15. Twice as old";

        return loops;
    }
}
