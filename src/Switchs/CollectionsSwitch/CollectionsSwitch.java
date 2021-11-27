package Switchs.CollectionsSwitch;

import Tasks.Collections.FilteringEven.FilteringEven;
import Tasks.Collections.FilteringEven.FilteringEvenImpl;
import Tasks.Collections.Interactive.DictionaryBook;
import Tasks.Collections.Interactive.DictionaryBookImpl;

import java.util.Scanner;

public class CollectionsSwitch {
    public void ChooseOption(final Scanner scanner) {
        System.out.println(ShowOptions());
        System.out.println("Choose one of options: ");
        final int task = scanner.nextInt();
        switch (task) {
            case 1 -> {
                System.out.println("Enter number of elements and fill Array list with int values: ");
                final FilteringEven filteringEven = new FilteringEvenImpl(scanner);
                System.out.println("It is an Array list with only odd numbers: " + filteringEven.removeEvenNumbers());
            }
            case 2 -> {
                System.out.println("Enter a key and value(word and it's explanation: ");
                final DictionaryBook dictionary = new DictionaryBookImpl(scanner);
                System.out.println("Adding one more word and it's explanation: ");
                dictionary.addWord(scanner);
                System.out.println("Looking for input key in dictionary: " + dictionary.findEntry(scanner));
            }
            default -> System.out.println("There is no such option! Please, enter right option: ");
        }
    }

    public String ShowOptions() {
        return """
                List of options:\040
                1. FilteringEven
                2. Interactive
                """;
    }
}
