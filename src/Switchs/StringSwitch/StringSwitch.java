package Switchs.StringSwitch;

import Switchs.Switch;
import Tasks.String.Banjo.Banjo;
import Tasks.String.Banjo.BanjoImpl;
import Tasks.String.CountOfOccurrences.Occurrences;
import Tasks.String.CountOfOccurrences.OccurrencesImpl;
import Tasks.String.ExclamationMarks.ExclamationMarks;
import Tasks.String.ExclamationMarks.ExclamationMarksImpl;
import Tasks.String.FakeBinary.FakeBinary;
import Tasks.String.FakeBinary.FakeBinaryImpl;
import Tasks.String.Hello.Hello;
import Tasks.String.Hello.HelloImpl;
import Tasks.String.NumberIntoString.NumberIntoString;
import Tasks.String.NumberIntoString.NumberIntoStringImpl;
import Tasks.String.OppositeNumber.OppositeNumber;
import Tasks.String.OppositeNumber.OppositeNumberImpl;
import Tasks.String.Position.Position;
import Tasks.String.Position.PositionImpl;
import Tasks.String.RemoveSpaces.RemoveSpaces;
import Tasks.String.RemoveSpaces.RemoveSpacesImpl;
import Tasks.String.ReplaceDots.ReplaceDots;
import Tasks.String.ReplaceDots.ReplaceDotsImpl;
import Tasks.String.ReversedString.ReversedString;
import Tasks.String.ReversedString.ReversedStringImpl;
import Tasks.String.TripleTrouble.TripleTrouble;
import Tasks.String.TripleTrouble.TripleTroubleImpl;
import Tasks.String.TwoWordName.TwoWordName;
import Tasks.String.TwoWordName.TwoWordNameImpl;

import java.util.Scanner;

public class StringSwitch implements Switch {
    @Override
    public void ChooseOption(final Scanner scanner){
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
                System.out.println("It is a message: " +  hello.sayHello());
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
            default -> System.out.println("There is no such option! Please, enter right option: ");
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
                """;
    }
}
