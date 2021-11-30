package Application;

import Collections.FilteringEvenNumbersBugFixes;
import Collections.InteractiveDictionary;
import Collections.PushHashSlashAnObjectIntoArray;
import Collections.UnfinishedLoopBugFixingNumber;
import Errors.NotANumber;

import java.util.*;

public class CollectionsList {
    public static String collectionsList() {
        String tasks =
                "1 - Push a hash slash an object into array\n" +
                        "2 - Unfinished loop bug fixing number\n" +
                        "3 - Filtering even numbers bug fixes\n" +
                        "4 - Interactive dictionary";

        return tasks;
    }

    public static void choiceCollection() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice : ");
        int num = NotANumber.CheckInt(scanner);
        try {
            switch (num) {
                default -> System.out.println("The is no such a task");
                case 1 -> {
                    LinkedList<String> list = new LinkedList<>();
                    for (int i = 0; i < list.size(); i++) {
                        list.add(i, scanner.next());
                    }
                    System.out.println(PushHashSlashAnObjectIntoArray.push(list));
                }
                case 2 -> {
                    System.out.print("Fixing infinity loop of numbers. Your number : ");
                    int s = scanner.nextInt();
                    System.out.println(UnfinishedLoopBugFixingNumber.CreateList(s));
                }
                case 3 -> {
                    System.out.print("Size of your ArrayList : ");
                    int capacity = scanner.nextInt();
                    int count=1;
                    List<Integer> list = new ArrayList<>();
                        for (int i = 0; i < capacity; i++) {
                            System.out.print("Parameter " + count++ +" : ");
                            list.add(i, scanner.nextInt());
                            }
                    System.out.println(FilteringEvenNumbersBugFixes.filterOddNumber(list));
                }
                case 4 -> {
                    System.out.println("Write key : ");
                    String key = scanner.next();
                    System.out.println("Write value : ");
                    String value = scanner.next();
                    Map map = new HashMap();
                    InteractiveDictionary.Dictionary dictionary = new InteractiveDictionary.Dictionary(map);
                    System.out.println(InteractiveDictionary.Dictionary.newEntry(key,value));
                    System.out.println(InteractiveDictionary.Dictionary.look(key));
                }
            }

        }finally {
            FinallyMethod.finallyMethod(scanner);
        }
    }
}
