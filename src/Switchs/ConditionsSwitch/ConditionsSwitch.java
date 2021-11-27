package Switchs.ConditionsSwitch;

import Switchs.Switch;
import Main.MainSwitch.*;
import Tasks.Classes.FractionClass.*;
import Tasks.Conditions.BasicMathematicalOperations.*;
import Tasks.Conditions.BooleanToString.*;
import Tasks.Conditions.OppositeNumber.*;
import Tasks.Conditions.YesOrNot.*;

import java.util.Scanner;

public class ConditionsSwitch implements Switch {
    @Override
    public void ChooseOption(final Scanner scanner) {
        System.out.println(ShowOptions());
        System.out.println("Choose one of options: ");
        final int task = scanner.nextInt();
        scanner.nextLine();

        switch (task) {
            case 1 -> {
                try {
                    System.out.println("Enter integer and fraction part of first and second number: ");
                    final FractionClass a = new FractionClassImpl(scanner);
                    final FractionClass b = new FractionClassImpl(scanner);
                    System.out.println("Enter type of operation(+, -, *, /): ");
                    final Calculator calc = new CalculatorImpl();
                    System.out.println(calc.calculator(a, scanner.next().charAt(0), b);
                } catch (final UnsupportedOperationException | ArithmeticException e) {
                    System.err.println(e.getMessage());
                }
            }
            case 2 -> {
                System.out.println("Enter true or false: ");
                final BooleanToString booleanToString = new BooleanToStringImpl(scanner);
                System.out.println("It is a String of boolean input: " + booleanToString.convertToString());
            }
            case 3 -> {
                System.out.println("Enter a number: ");
                final OppositeNumber oppositeNumber = new OppositeNumberImpl(scanner);
                System.out.println("It is an opposite of input number: " + oppositeNumber.oppositeNumber());
            }
            case 4 -> {
                System.out.println("Enter true of false: ");
                final YesOrNot yesOrNot = new YesOrNotImpl(scanner);
                System.out.println("It is true?: ");
            }
            case 0 -> {
            }
            case -1 -> {
                final MainSwitch mainSwitch = new MainSwitchImpl();
                mainSwitch.ChooseOption(scanner);
            }
            default -> {
                System.out.println("There is no " + task + " option! Try again!");
                new ConditionsSwitch().ChooseOption(scanner);
            }
        }
    }

    @Override
    public String ShowOptions() {
        return """
                List of options:\040
                1. BasicMathematicalOperations
                2. BooleanToString
                3. OppositeNumber
                4. YesOrNot
                0. EXIT
                 -1. Return to main Menu
                """;
    }
}