package Switchs.StringSwitch;

import Switchs.Switch;
import Main.MainSwitch.*;
import Tasks.String.Banjo.*;
import Tasks.String.CountOfOccurrences.*;
import Tasks.String.ExclamationMarks.*;
import Tasks.String.FakeBinary.*;
import Tasks.String.Hello.*;
import Tasks.String.NumberIntoString.*;
import Tasks.String.OppositeNumber.*;
import Tasks.String.Position.*;
import Tasks.String.RemoveSpaces.*;
import Tasks.String.ReplaceDots.*;
import Tasks.String.ReversedString.*;
import Tasks.String.TripleTrouble.*;
import Tasks.String.TwoWordName.*;

import java.util.Scanner;

public class StringSwitch implements Switch {
    @Override
    public void ChooseOption(final Scanner scanner) {
        System.out.println(ShowOptions());
        System.out.println("Choose one of options: ");
        final int task = scanner.nextInt();
        scanner.nextLine();

        switch (task) {
            case 1 -> {
                System.out.println("Enter a name: ");
                final Banjo banjo = new BanjoImpl(scanner);
                System.out.println(banjo.playingBanjo());
            }
            case 2 -> {
                System.out.println("Enter a String and char symbol: ");
                final Occurrences occurrences = new OccurrencesImpl(scanner);
                System.out.println("It is a count of occurrences of symbol in a String: " + occurrences.countOfOccurrences());
            }
            case 3 -> {
                System.out.println("Enter a String, which contains one or more '!', and positive number: ");
                final ExclamationMarks exclamationMarks = new ExclamationMarksImpl(scanner);
                System.out.println("It is a result of deleting 'n' number of '!': " + exclamationMarks.removeExclamationMarks());
            }
            case 4 -> {
                System.out.println("Enter a String, which contains of positive numbers: ");
                final FakeBinary fakeBinary = new FakeBinaryImpl(scanner);
                System.out.println("It is a fake binary of input String: " + fakeBinary.replaceDigits());
            }
            case 5 -> {
                System.out.println("Enter name, city and state: ");
                final Hello hello = new HelloImpl(scanner);
                System.out.println("It is a message: " + hello.sayHello());
            }
            case 6 -> {
                System.out.println("Enter a number: ");
                final NumberIntoString numberIntoString = new NumberIntoStringImpl(scanner);
                System.out.println("It is a String of input number" + numberIntoString.convertToString());
            }
            case 7 -> {
                System.out.println("Enter a number: ");
                final OppositeNumber oppositeNumber = new OppositeNumberImpl(scanner);
                System.out.println(oppositeNumber.toOppositeNumber());
            }
            case 8 -> {
                System.out.println("Enter a letter: ");
                final Position position = new PositionImpl(scanner);
                System.out.println("Position of letter in alphabet is " + position.findPosition());
            }
            case 9 -> {
                System.out.println("Enter a String with spaces: ");
                final RemoveSpaces removeSpaces = new RemoveSpacesImpl(scanner);
                System.out.println("It is a result of removing spaces: " + removeSpaces.removingSpaces());
            }
            case 10 -> {
                System.out.println("Enter a String with dots: ");
                final ReplaceDots replaceDots = new ReplaceDotsImpl(scanner);
                System.out.println("It is a result of replacing dots: " + replaceDots.replaceDotsWithDashes());
            }
            case 11 -> {
                System.out.println("Enter a String: ");
                final ReversedString reversedString = new ReversedStringImpl(scanner);
                System.out.println("It is a reversed String: " + reversedString.toReverseString());
            }
            case 12 -> {
                System.out.println("Enter 3 Strings:");
                final TripleTrouble tripleTrouble = new TripleTroubleImpl(scanner);
                System.out.println("It is a combined String of 3 inputs: " + tripleTrouble.combineTriple());
            }
            case 13 -> {
                System.out.println("Enter a name and surname: ");
                final TwoWordName twoWordName = new TwoWordNameImpl(scanner);
                System.out.println("It is your initials: " + twoWordName.convertNameToInitials());
            }
            case 0 -> {
            }
            case -1 -> {
                final MainSwitch mainSwitch = new MainSwitchImpl();
                mainSwitch.ChooseOption(scanner);
            }
            default -> {
                System.out.println("There is no " + task + " option! Try again!");
                new StringSwitch().ChooseOption(scanner);
            }
        }
    }

    @Override
    public String ShowOptions() {
        return """
                List of options:\040
                1. Banjo
                2. CountOfOccurrences
                3. ExclamationMarks
                4. FakeBinary
                5. Hello
                6. NumberIntoString
                7. OppositeNumber
                8. Position
                9. RemoveSpaces
                10. ReplaceDots
                11. ReversedString
                12. TripleTrouble
                13. TwoWordName
                0. EXIT
               -1. Return to main Menu
                """;
    }
}