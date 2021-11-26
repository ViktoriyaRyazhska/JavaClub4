package Tasks.Main;

import Tasks.Loops.ArrayMean.ArrayMean;
import Tasks.Loops.ArrayMean.ArrayMeanImpl;
import Tasks.Loops.BetterThan.BetterThan;
import Tasks.Loops.BetterThan.BetterThanImpl;
import Tasks.Loops.ChangePosition.ChangePosition;
import Tasks.Loops.ChangePosition.ChangePositionImpl;
import Tasks.Loops.DoubledArray.DoubledArray;
import Tasks.Loops.DoubledArray.DoubledArrayImpl;
import Tasks.Loops.ReduceButGrow.ReduceButGrow;
import Tasks.Loops.ReduceButGrow.ReduceButGrowImpl;
import Tasks.Loops.ReversedSequence.ReversedSequence;
import Tasks.Loops.ReversedSequence.ReversedSequenceImpl;
import Tasks.Loops.StringRepeat.StringRepeat;
import Tasks.Loops.StringRepeat.StringRepeatImpl;
import Tasks.Loops.SumOfPositive.SumOfPositive;
import Tasks.Loops.SumOfPositive.SumOfPositiveImpl;
import Tasks.Loops.Summation.Summation;
import Tasks.Loops.Summation.SummationImpl;
import Tasks.Loops.TwentyOne.TwentyOne;
import Tasks.Loops.TwentyOne.TwentyOneImpl;
import String.Banjo.Banjo;
import String.Banjo.BanjoImpl;
import String.CountOfOccurrences.Occurrences;
import String.CountOfOccurrences.OccurrencesImpl;
import String.ExclamationMarks.ExclamationMarks;
import String.ExclamationMarks.ExclamationMarksImpl;
import String.FakeBinary.FakeBinary;
import String.FakeBinary.FakeBinaryImpl;
import String.Hello.Hello;
import String.Hello.HelloImpl;
import String.NumberIntoString.NumberIntoString;
import String.NumberIntoString.NumberIntoStringImpl;
import String.OppositeNumber.OppositeNumber;
import String.OppositeNumber.OppositeNumberImpl;
import String.Position.Position;
import String.Position.PositionImpl;
import String.RemoveSpaces.RemoveSpaces;
import String.RemoveSpaces.RemoveSpacesImpl;
import String.ReplaceDots.ReplaceDots;
import String.ReplaceDots.ReplaceDotsImpl;
import String.ReversedString.ReversedString;
import String.ReversedString.ReversedStringImpl;
import String.TripleTrouble.TripleTrouble;
import String.TripleTrouble.TripleTroubleImpl;
import String.TwoWordName.TwoWordName;
import String.TwoWordName.TwoWordNameImpl;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any 'Name', 'city' and 'state': ");
        final Hello hello = new HelloImpl(scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
        System.out.println(hello.sayHello());

        System.out.println("Enter any 'Name': ");
        final Banjo banjo = new BanjoImpl(scanner.nextLine());
        System.out.println(banjo.playingBanjo());

        System.out.println("Enter any 'String' and 'String': ");
        final Occurrences occurrences = new OccurrencesImpl(scanner.nextLine(), scanner.nextLine());
        System.out.println(occurrences.countOfOccurrences());

        System.out.println("Enter 'String' containing any count of '!' and positive number: ");
        final ExclamationMarks exclamationMarks = new ExclamationMarksImpl(scanner.nextLine(), scanner.nextInt());
        System.out.println(exclamationMarks.removeExclamationMarks());

        System.out.println("Enter 'String' consisting of numbers: ");
        final FakeBinary fakeBinary = new FakeBinaryImpl(scanner.nextLine());
        System.out.println(fakeBinary.replaceDigits());

        System.out.println("Enter any number: ");
        final NumberIntoString numberIntoString = new NumberIntoStringImpl(scanner.nextInt());
        System.out.println(numberIntoString.convertToString());

        System.out.println("Enter any number: ");
        final OppositeNumber oppositeNumber = new OppositeNumberImpl(scanner.nextInt());
        System.out.println(oppositeNumber.toOppositeNumber());

        System.out.println("Enter any letter: ");
        final Position position = new PositionImpl(scanner.nextLine());
        System.out.println("Position of letter in alphabet is " + position.findPosition());

        System.out.println("Enter String with spaces: ");
        final RemoveSpaces removeSpaces = new RemoveSpacesImpl(scanner.nextLine());
        System.out.println(removeSpaces.removingSpaces());

        System.out.println("Enter String: ");
        final ReversedString reversedString = new ReversedStringImpl(scanner.nextLine());
        System.out.println(reversedString.toReverseString());

        System.out.println("Enter 3 Strings of any length:");
        final TripleTrouble tripleTrouble = new TripleTroubleImpl(scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
        System.out.println(tripleTrouble.combineTriple());

        System.out.println("Enter your name and surname: ");
        final TwoWordName twoWordName = new TwoWordNameImpl(scanner.nextLine(), scanner.nextLine());
        System.out.println(twoWordName.convertNameToInitials());

        System.out.println("Enter String with dots: ");
        final ReplaceDots replaceDots = new ReplaceDotsImpl(scanner.nextLine());
        System.out.println(replaceDots.replaceDotsWithDashes());


        System.out.println("Enter any positive number: ");
        final Summation sum = new SummationImpl(scanner);
        System.out.println(sum.summation());

        System.out.println("Enter size of array and fill it with int values: ");
        final ArrayMean arrayMean = new ArrayMeanImpl(scanner);
        System.out.println(arrayMean.averageOfArray());

        System.out.println("Enter size of array, fill it with int values and enter point: ");
        final BetterThan betterThan = new BetterThanImpl(scanner);
        System.out.println(betterThan.betterThanAverage());

        System.out.println("Creating array: ");
        final ChangePosition changePosition = new ChangePositionImpl(scanner);
        System.out.println(Arrays.toString(changePosition.sorting()));

        System.out.println("Enter size of array and fill it with int values: ");
        final DoubledArray doubledArray = new DoubledArrayImpl(scanner);
        System.out.println(Arrays.toString(doubledArray.doubleArray()));

        System.out.println("Enter size of array and fill it with int values: ");
        final ReduceButGrow reduceButGrow = new ReduceButGrowImpl(scanner);
        System.out.println(reduceButGrow.multiplyingValues());

        System.out.println("Enter size of array and fill it with int values: ");
        final ReversedSequence reversedSequence = new ReversedSequenceImpl(scanner);
        System.out.println(Arrays.toString(reversedSequence.reversedSequence()));

        System.out.println("Enter String and count of repeating: ");
        final StringRepeat stringRepeat = new StringRepeatImpl(scanner);
        stringRepeat.toRepeatString();

        System.out.println("Enter size of array and fill it with int values: ");
        final SumOfPositive sumOfPositive = new SumOfPositiveImpl(scanner);
        System.out.println(sumOfPositive.sumOfPositive());

        System.out.println("Play a Twenty one stick game with AI: ");
        final TwentyOne twentyOne = new TwentyOneImpl();
        twentyOne.playGame(scanner);
    }
}
