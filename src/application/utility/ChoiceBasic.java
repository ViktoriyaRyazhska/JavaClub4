package application.utility;

import application.tasks.basic.*;

import java.util.Scanner;

public class ChoiceBasic {

    // функція для вибору таски з списку basic
    public static void choiceBasic(Scanner in) {
        System.out.println(listOfBasicOptions());
        System.out.print("Select an option:\n> ");
        int option = in.nextInt();

        switch (option) {
            default:
                System.out.println("Sorry.. this option don`t exist");
                break;
            case 0:
                break;
            case -1:
                ChoiceList.choiceList(in);
                break;
            case 1:
                AgeRange.task(in);
                ChoiceBasic.choiceBasic(in);
                break;
            case 2:
                BeginnerSeries.task(in);
                ChoiceBasic.choiceBasic(in);
                break;
            case 3:
                CenturyFromYear.task(in);
                ChoiceBasic.choiceBasic(in);
                break;
            case 4:
                ConvertToBinary.task(in);
                ChoiceBasic.choiceBasic(in);
                break;
            case 5:
                CuboidVolume.task(in);
                ChoiceBasic.choiceBasic(in);
                break;
            case 6:
                GrassHopper.task(in);
                ChoiceBasic.choiceBasic(in);
                break;
            case 7:
                JennySecretMessage.task(in);
                ChoiceBasic.choiceBasic(in);
                break;
            case 8:
                MultiplyNumbers.task(in);
                ChoiceBasic.choiceBasic(in);
                break;
            case 9:
                PixelArtPlanning.task(in);
                ChoiceBasic.choiceBasic(in);
                break;
            case 10:
                ReturnNegative.task(in);
                ChoiceBasic.choiceBasic(in);
                break;
            case 11:
                UnderPressure.task(in);
                ChoiceBasic.choiceBasic(in);
                break;
        }
    }
    // список basic
    public static String listOfBasicOptions() {
        String basicOptions =
                "\nList of basic tasks:\n" +
                "1. AgeRange\n" +
                "2. BeginnerSeries\n" +
                "3. CenturyFromYear\n" +
                "4. ConvertToBinary\n" +
                "5. CuboidVolume\n" +
                "6. GrassHopper\n" +
                "7. JennySecretMessage\n" +
                "8. MultiplyNumbers\n" +
                "9. PixelArtPlanning\n" +
                "10. ReturnNegative\n" +
                "11. UnderPressure\n" +
                "-1 Back\n" +
                "0. Exit\n";

        return basicOptions;
    }
}
