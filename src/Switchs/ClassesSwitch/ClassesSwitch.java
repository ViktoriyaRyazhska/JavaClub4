package Switchs.ClassesSwitch;

import Switchs.Switch;
import Tasks.Classes.BuildingBlocks.BuildingBlocks;
import Tasks.Classes.BuildingBlocks.BuildingBlocksImpl;
import Tasks.Classes.FixStaticElectrickery.FixStaticElectrickery;
import Tasks.Classes.FixStaticElectrickery.FixStaticElectrickeryImpl;
import Tasks.Classes.FractionClass.FractionClass;
import Tasks.Classes.FractionClass.FractionClassImpl;
import Tasks.Classes.LombokEncapsulation.LombokEncapsulation;
import Tasks.Classes.TwoFightersOneWinner.Fight;
import Tasks.Classes.TwoFightersOneWinner.FightImpl;
import Tasks.Classes.TwoFightersOneWinner.TwoFightersOneWinner;

import java.util.Scanner;

public class ClassesSwitch implements Switch {
    @Override
    public void ChooseOption(final Scanner scanner) {
        System.out.println(ShowOptions());
        System.out.println("Choose one of options: ");
        final int task = scanner.nextInt();
        scanner.nextLine();

        switch (task) {
            case 1 -> {
                System.out.println("Enter width, length and height of block: ");
                final BuildingBlocks buildingBlocks = new BuildingBlocksImpl(scanner);
                System.out.println("It is a volume of your block: " + buildingBlocks.getVolume());
                System.out.println("It is a surface of your block: " + buildingBlocks.getSurfaceArea());
            }
            case 2 -> {
                System.out.println("Enter a number: ");
                final FixStaticElectrickery fixStaticElectrickery = new FixStaticElectrickeryImpl(scanner);
                System.out.println("It is a number + 100: " + fixStaticElectrickery.plus100());
            }
            case 3 -> {
                try {
                    System.out.println("Enter integer and fraction part of first and second number: ");
                    final FractionClass a = new FractionClassImpl(scanner);
                    final FractionClass b = new FractionClassImpl(scanner);
                    System.out.println("It is a sum of two numbers: " + a.add(b).toDouble());
                    System.out.println("It is a minus of two numbers: " + a.differ(b).toDouble());
                    System.out.println("It is a product of two numbers: " + a.multi(b).toDouble());
                    System.out.println("It is a division of two numbers: " + a.divide(b).toDouble());
                } catch (final ArithmeticException e) {
                    System.err.println(e.getMessage());
                }
            }
            case 4 -> {
                System.out.println("Return values of encapsulated variables: ");
                final LombokEncapsulation lombokEncapsulation = new LombokEncapsulation();
                System.out.println("It is a value of int: " + lombokEncapsulation.getNumber());
                System.out.println("It is a value of String: " + lombokEncapsulation.getStringValue());
                System.out.println("It is an Object: " + lombokEncapsulation.getAnObject());
            }
            case 5 -> {
                System.out.println("Enter name, health and damage per attack for both fighters: ");
                final TwoFightersOneWinner a = new TwoFightersOneWinner(scanner);
                final TwoFightersOneWinner b = new TwoFightersOneWinner(scanner);
                final Fight fight = new FightImpl();
                System.out.println("The winner is: " + fight.declareWinner(a, b));
            }
            case 0 -> {
            }
            default -> {
                System.out.println("There is no " + task + " option! Try again!");
                new ClassesSwitch().ChooseOption(scanner);
            }
        }
    }

    @Override
    public String ShowOptions() {
        return """
                List of options:\040
                1. BuildingBlocks
                2. FixStaticElectrickery
                3. FractionsClass
                4. LombokEncapsulation
                5. TwoFightersOneWinner
                0. EXIT
                """;
    }
}
