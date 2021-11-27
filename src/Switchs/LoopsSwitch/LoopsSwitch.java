package Switchs.LoopsSwitch;

import Switchs.Switch;
import Main.MainSwitch.*;
import Tasks.Loops.ArrayMean.*;
import Tasks.Loops.BetterThan.*;
import Tasks.Loops.ChangePosition.*;
import Tasks.Loops.DoubledArray.*;
import Tasks.Loops.ReduceButGrow.*;
import Tasks.Loops.ReversedSequence.*;
import Tasks.Loops.StringRepeat.*;
import Tasks.Loops.SumOfPositive.*;
import Tasks.Loops.Summation.*;
import Tasks.Loops.TwentyOne.*;

import java.util.Arrays;
import java.util.Scanner;

public class LoopsSwitch implements Switch {
    @Override
    public void ChooseOption(final Scanner scanner) {
        System.out.println(ShowOptions());
        System.out.println("Choose one of options: ");
        final int task = scanner.nextInt();
        scanner.nextLine();

        switch (task) {
            case 1 -> {
                System.out.println("Enter a size of array and fill it with positive int values: ");
                final ArrayMean arrayMean = new ArrayMeanImpl(scanner);
                System.out.println("It is rounded average of your array: " + arrayMean.averageOfArray());
            }
            case 2 -> {
                System.out.println("Enter a size of array, fill it with positive values[1-12] and enter your point: ");
                final BetterThan betterThan = new BetterThanImpl(scanner);
                System.out.println("Is your point bigger than average?: " + betterThan.betterThanAverage());
            }
            case 3 -> {
                System.out.println("Fill array with values('head', 'tail' and 'body'): ");
                final ChangePosition changePosition = new ChangePositionImpl(scanner);
                System.out.println("It is a sorted array: " + Arrays.toString(changePosition.sorting()));
            }
            case 4 -> {
                System.out.println("Enter a size of array and fill it with positive int values: ");
                final DoubledArray doubledArray = new DoubledArrayImpl(scanner);
                System.out.println("It is a doubled array: " + Arrays.toString(doubledArray.doubleArray()));
            }
            case 5 -> {
                System.out.println("Enter a size of array and fill it with positive int values: ");
                final ReduceButGrow reduceButGrow = new ReduceButGrowImpl(scanner);
                System.out.println("It is a product of elements in array: " + reduceButGrow.multiplyingValues());
            }
            case 6 -> {
                System.out.println("Enter a positive number: ");
                final ReversedSequence reversedSequence = new ReversedSequenceImpl(scanner);
                System.out.println("It is a reversed sequence from your number to 1: " + Arrays.toString(reversedSequence.reversedSequence()));
            }
            case 7 -> {
                System.out.println("Enter a String and count of repeating: ");
                final StringRepeat stringRepeat = new StringRepeatImpl(scanner);
                System.out.print("It is a new String: ");
                stringRepeat.toRepeatString();
            }
            case 8 -> {
                System.out.println("Enter a positive number: ");
                final Summation sum = new SummationImpl(scanner);
                System.out.println("It is a sum of elements from your number to 1: " + sum.summation());
            }
            case 9 -> {
                System.out.println("Enter a positive number: ");
                final SumOfPositive sumOfPositive = new SumOfPositiveImpl(scanner);
                System.out.println("It is a sum of positive elements in array: " + sumOfPositive.sumOfPositive());
            }
            case 10 -> {
                System.out.println("Play a Twenty one stick game with AI: ");
                final TwentyOne twentyOne = new TwentyOneImpl();
                twentyOne.playGame(scanner);
            }
            case -1 -> {
                final MainSwitch mainSwitch = new MainSwitchImpl();
                mainSwitch.ChooseOption(scanner);
            }
            default -> {
                System.out.println("There is no " + task + " option! Try again!");
                new LoopsSwitch().ChooseOption(scanner);
            }
        }
    }

    @Override
    public String ShowOptions() {
        return """
                List of options:\040
                1. ArrayMean
                2. BetterThan
                3. ChangePosition
                4. DoubleArray
                5. ReduceButGrow
                6. ReversedSequence
                7. StringRepeat
                8. Summation
                9. SumOfPositive
                10. TwentyOne
                0. EXIT
                """;
    }
}