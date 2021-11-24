package application.utility;

import application.tasks.basic.*;

import java.util.Scanner;

public class ChoiceBasic {

    // функція для вибору таски з списку basic
    public static void choiceBasic() {
        System.out.println(listOfBasicOptions());
        System.out.print("Select an option:\n> ");
        Scanner in = new Scanner(System.in);
        int option = in.nextInt();

        switch (option) {
            default:
                System.out.println("Sorry.. this option don`t exist");
                break;
            case 0:
                break;
            case -1:
                ChoiceList.choiceList();
                break;
            case 1:
                AgeRange.task();
                break;
            case 2:
             //   BeginnerSeries.task();
                break;
            case 3:
              //  CenturyFromYear.task();
                break;
            case 4:
                ConvertToBinary.task();
                break;
            case 5:
                CuboidVolume.task();
                break;
            case 6:
                GrassHopper.task();
                break;
            case 7:
                JennySecretMessage.task();
                break;
            case 8:
                MultiplyNumbers.task();
                break;
            case 9:
                PixelArtPlanning.task();
                break;
            case 10:
             //   ReturnNegative.task();
                break;
            case 11:
                UnderPressure.task();
                break;


        }
    }
    // список basic
    public static String listOfBasicOptions() {
        String basicOptions =
                "\nList of basic tasks:\n" +
                "1. AgeRange\n" +
                "2. BooleanToString\n" +
                "3. CenturyFromYear\n" +
                "4. ConvertToBinary\n" +
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
