package application.utility;

import application.tasks.basic.AgeRange;
import application.tasks.basic.CuboidVolume;
import application.tasks.basic.MultiplyNumbers;
import application.tasks.basic.UnderPressure;

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

        }
    }
    // список basic
    public static String listOfBasicOptions() {
        String basicOptions = "\nList of basic tasks:\n" +
                "-1. Back\n" +
                "0. Exit\n";

        return basicOptions;
    }
}
