package Application;

import Collections.FilteringEvenNumbersBugFixes;
import Collections.PushHashSlashAnObjectIntoArray;
import Collections.UnfinishedLoopBugFixingNumber;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionsList {
    public static String collectionsList() {
        String tasks =
                "1 - Push-a-hash-slash-an-object-into-array\n" +
                        "2 - Unfinished-loop-bug-fixing-number-1\n" +
                        "3 - Filtering-even-numbers-bug-fixes\n" +
                        "4 - Interactive-dictionary";

        return tasks;
    }

    public static void choiceCollection() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        try {
            switch (num) {
                default -> System.out.println("The is no such a task");
                case 1 -> {
                    ArrayList<String> list = new ArrayList<>();
                    for (int i = 0; i < list.size(); i++) {
                        list.add(i, scanner.next());
                    }
                    System.out.println(PushHashSlashAnObjectIntoArray.push(list));
                }
                case 2 -> {
                    int s = scanner.nextInt();
                    System.out.println(UnfinishedLoopBugFixingNumber.CreateList(s));
                }
                case 3 -> {
                    ArrayList<Integer> list = new ArrayList<>();
                    for (int i = 0; i < list.size(); i++) {
                        list.add(i, scanner.nextInt());
                    }
                    System.out.println(FilteringEvenNumbersBugFixes.filterOddNumber(list));
                }
                case 4 -> {

                }
            }

        }finally {
            FinallyMethod.finallyMethod(scanner);
        }
    }
}
