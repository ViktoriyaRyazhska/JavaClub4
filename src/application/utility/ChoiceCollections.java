package application.utility;

import application.tasks.basic.*;
import application.tasks.collections.Dictionary;
import application.tasks.collections.NumbersBug;
import application.tasks.collections.PushAnObjectIntoArray;
import application.tasks.collections.UnfinishedLoop;

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
                Dictionary.task(in);
                ChoiceCollections.choiceCollections(in);
                break;
            case 2:
                PushAnObjectIntoArray.task(in);
                ChoiceCollections.choiceCollections(in);
                break;
            case 3:
                UnfinishedLoop.task(in);
                ChoiceCollections.choiceCollections(in);
                break;
            case 4:
                //NumbersBug.task(in);
                ChoiceCollections.choiceCollections(in);
                break;

        }
    }
    // список basic
    public static String listOfCollectionsOptions() {
        String collectionsOptions =
                "\nList of basic tasks:\n" +
                        "1. Dictionary\n" +
                        "2. PushAnObjectIntoArray\n" +
                        "3. UnfinishedLoop\n" +
                        "4. FilteringEven\n" +
                        "-1. Back\n" +
                        "0. Exit\n";

        return collectionsOptions;
    }
}
