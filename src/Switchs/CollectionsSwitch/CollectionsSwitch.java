package Switchs.CollectionsSwitch;

import Switchs.Switch;
import Main.MainSwitch.*;
import Tasks.Collections.FilteringEven.*;
import Tasks.Collections.Interactive.*;

import java.util.Scanner;

public class CollectionsSwitch implements Switch {
    @Override
    public void ChooseOption(final Scanner scanner) {
        System.out.println(ShowOptions());
        System.out.println("Choose one of options: ");
        final int task = scanner.nextInt();
        scanner.nextLine();

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
            case 0 -> {
            }
            case -1 -> {
                final MainSwitch mainSwitch = new MainSwitchImpl();
                mainSwitch.ChooseOption(scanner);
            }
            default -> {
                System.out.println("There is no " + task + " option! Try again!");
                new CollectionsSwitch().ChooseOption(scanner);
            }
        }
    }

    @Override
    public String ShowOptions() {
        return """
                List of options:\040
                1. FilteringEven
                2. Interactive
                0. EXIT
                """;
    }
}