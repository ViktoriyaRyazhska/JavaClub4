package Application;

import java.util.Scanner;

public class ListOfPackages {
    public static String listOfPackages() {
        String listPack = "1 - Basic programs\n" +
                "2 - Classes\n" +
                "3 - Collections\n" +
                "4 - Conditions\n" +
                "5 - Loops\n" +
                "6 - String\n" +
                "7 - OOP\n" +
                "0 - Exit";
        return listPack;
    }

    public static void choice() {
        System.out.print("Choose which one u want to : ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        switch (num) {
            default -> {
                System.out.println("There is no such Package!");
            }
            case 1 -> {
                System.out.println(BasicsList.basicsList());
                BasicsList.choiceBasics();
            }
            case 2 -> {
                System.out.println(ClassesList.classesList());
                ClassesList.choiceClasses();
            }
            case 3 -> {
                System.out.println(CollectionsList.collectionsList());
                CollectionsList.choiceCollection();
            }
            case 4 -> {
                System.out.println(ConditionsList.conditionsList());
                ConditionsList.choiceConditions();
            }
            case 5 -> {
                System.out.println(LoopsList.loopsList());
                LoopsList.choiceLoops();
            }
            case 6 -> {
                System.out.println(StringList.stringList());
                StringList.choiceString();
            }
            case 7 -> {
                System.out.println(OOPList.oopList());
                OOPList.choiceOOP();
            }
            case 0 -> {
                System.out.println("Bye,see you!");
            }
        }
    }
}
