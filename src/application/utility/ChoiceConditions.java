package application.utility;

import application.tasks.conditions.*;

import java.util.Scanner;

public class ChoiceConditions extends Constants{

    public static void choiceConditions(Scanner scanner) {
        System.out.println(listOfConditionsOptions());
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
                AgeDiff.task(scanner);
                ChoiceConditions.choiceConditions(scanner);
                break;
            case 2:
                BooleanToString.task(scanner);
                ChoiceConditions.choiceConditions(scanner);
                break;
            case 3:
                DoIGetBonus.task(scanner);
                ChoiceConditions.choiceConditions(scanner);
                break;
            case 4:
                IsDivisible.task(scanner);
                ChoiceConditions.choiceConditions(scanner);
                break;
            case 5:
                //LogicDrills.task(scanner);
                ChoiceConditions.choiceConditions(scanner);
                break;
            case 6:
                //MathematicalOperations.task(scanner);
                ChoiceConditions.choiceConditions(scanner);
                break;
            case 7:
                OppositeNumber.task(scanner);
                ChoiceConditions.choiceConditions(scanner);
                break;
            case 8:
                //OppositesAttract.task(scanner);
                ChoiceConditions.choiceConditions(scanner);
                break;
            case 9:
                RockPaperScissors.task(scanner);
                ChoiceConditions.choiceConditions(scanner);
                break;
            case 10:
                SwitchItUp.task(scanner);
                ChoiceConditions.choiceConditions(scanner);
                break;
            case 11:
                TheModuloSequence.task(scanner);
                ChoiceConditions.choiceConditions(scanner);
                break;
            case 12:
                //TransportationOnVacation.task(scanner);
                ChoiceConditions.choiceConditions(scanner);
                break;
            case 13:
                //ValuesToStrings.task(scanner);
                ChoiceConditions.choiceConditions(scanner);
                break;
            case 14:
                WillBeEnoughSpace.task(scanner);
                ChoiceConditions.choiceConditions(scanner);
                break;


        }
    }
    // список conditions
    public static String listOfConditionsOptions() {
        String conditionsOptions = "\nList of conditions tasks:\n" +
                "-1. Back\n" +
                "0. Exit\n" +
                "1. Age Difference\n" +
                "2. Boolean to String\n" +
                "3. Do I Get Bonus\n" +
                "4. Is Divisible\n" +
                "5. Logic Drills\n" +
                "6. Mathematical Operations\n" +
                "7. Opposite Number\n" +
                "8. Opposites Attract\n" +
                "9. Rock Paper Scissors\n" +
                "10. Switch It Up\n" +
                "11. The Modulo Sequence\n" +
                "12. Transportation on Vacation\n" +
                "13. Values to Strings\n" +
                "14. Will Be Enough Space";


        return conditionsOptions;
    }
}
