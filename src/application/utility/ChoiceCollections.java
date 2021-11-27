package application.utility;

import application.tasks.basic.*;

import java.util.Scanner;

public class ChoiceCollections {
    public static void choiceCollections(Scanner in) {
        System.out.println(listOfCollectionsOptions());
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
                break;
            case 2:
                //   BeginnerSeries.task(in);
                break;
            case 3:
                //  CenturyFromYear.task(in);
                break;
            case 4:
                ConvertToBinary.task(in);
                break;
            case 5:
                CuboidVolume.task(in);
                break;
            case 6:
                GrassHopper.task(in);
                break;
            case 7:
                JennySecretMessage.task(in);
                break;
            case 8:
                MultiplyNumbers.task(in);
                break;
            case 9:
                PixelArtPlanning.task(in);
                break;
            case 10:
                //   ReturnNegative.task(in);
                break;
            case 11:
                UnderPressure.task(in);
                break;


        }
    }
    // список basic
    public static String listOfCollectionsOptions() {
        String basicOptions =
                "\nList of basic tasks:\n" +
                        "1. Dictionary\n" +
                        "2. PushAnObjectIntoArray\n" +
                        "3. UnfinishedLoop\n" +
                        "4. //ConvertToBinary\n" +
                        "5. CuboidVolume\n" +
                        "6. GrassHopper\n" +
                        "7. JennySecretMessage\n" +
                        "8. MultiplyNumbers\n" +
                        "9. PixelArtPlanning\n" +
                        "10. ReturnNegative\n" +
                        "11. UnderPressure\n" +
                        "0. Exit\n";

        return basicOptions;
    }
}
