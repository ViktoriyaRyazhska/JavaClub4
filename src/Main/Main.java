package Main;

import Loops.Summation.SummationImpl;
import String.Banjo.BanjoImpl;
import String.CountOfOccurrences.OccurrencesImpl;
import String.ExclamationMarks.ExclamationMarksImpl;
import String.FakeBinary.FakeBinaryImpl;
import String.Hello.HelloImpl;
import String.NumberIntoString.NumberIntoStringImpl;
import String.OppositeNumber.OppositeNumberImpl;
import String.Position.PositionImpl;
import String.RemoveSpaces.RemoveSpacesImpl;

import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any positive number: ");
        final SummationImpl sum = new SummationImpl(scanner.nextInt());
        System.out.println(sum.summation());

        System.out.println("Enter any 'Name', 'city' and 'state': ");
        final HelloImpl hello = new HelloImpl(scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
        System.out.println(hello.sayHello());

        System.out.println("Enter any 'Name': ");
        final BanjoImpl banjo = new BanjoImpl(scanner.nextLine());
        System.out.println(banjo.playingBanjo());

        System.out.println("Enter any 'String' and 'String': ");
        final OccurrencesImpl occurrences = new OccurrencesImpl(scanner.nextLine(), scanner.nextLine());
        System.out.println(occurrences.countOfOccurrences());

        System.out.println("Enter 'String' containing any count of '!' and positive number: ");
        final ExclamationMarksImpl exclamationMarks = new ExclamationMarksImpl(scanner.nextLine(), scanner.nextInt());
        System.out.println(exclamationMarks.removeExclamationMarks());

        System.out.println("Enter 'String' consisting of numbers: ");
        final FakeBinaryImpl fakeBinary = new FakeBinaryImpl(scanner.nextLine());
        System.out.println(fakeBinary.replaceDigits());

        System.out.println("Enter any number: ");
        final NumberIntoStringImpl numberIntoString = new NumberIntoStringImpl(scanner.nextInt());
        System.out.println(numberIntoString.convertToString());

        System.out.println("Enter any number: ");
        final OppositeNumberImpl oppositeNumber = new OppositeNumberImpl(scanner.nextInt());
        System.out.println(oppositeNumber.toOppositeNumber());

        System.out.println("Enter any letter: ");
        final PositionImpl position = new PositionImpl(scanner.nextLine());
        System.out.println("Postion of letter " + position.getLetter() + " in alphabet is " + position.findPosition());

        System.out.println("Enter String with spaces: ");
        final RemoveSpacesImpl removeSpaces = new RemoveSpacesImpl(scanner.nextLine());
        System.out.println(removeSpaces.removingSpaces());
    }
}
