package classes;

import java.util.Scanner;

import static main.MenuImpl.chooseMenu;

public class Classes_Task_5_Game {

    public static String declareWinner(Classes_Task_5 fighter1, Classes_Task_5 fighter2, String firstAttacker) {
        String winner = "";
        boolean firstAtack = false;

        if (firstAttacker == fighter1.name) {
            firstAtack = true;
        }

        while (winner == "") {
            if (firstAtack) {
                if (fighter1.health > 0) {
                    fighter2.health = fighter2.health - fighter1.damagePerAttack;
                    firstAtack = !firstAtack;
                } else {
                    winner = fighter2.name;
                }
            } else {
                if (fighter2.health > 0) {
                    fighter1.health = fighter1.health - fighter2.damagePerAttack;
                    firstAtack = !firstAtack;
                } else {
                    winner = fighter1.name;
                }
            }
        }
        return winner;
    }

    public static void solveTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This task plays a game with fight between two fingers\nNow you will create two players");
        System.out.println("Please enter the name of first player: ");
        String name1 = scanner.nextLine();
        System.out.println("Please enter the name of second player: ");
        String name2 = scanner.nextLine();
        System.out.println("Please enter a health of first player: ");
        int health1 ;
        while (!scanner.hasNextInt()) {
            System.out.println("That's not an integer, enter integer type:");
            scanner.next();
        }
        health1 = scanner.nextInt();
        System.out.println("Please enter a health of second player: ");
        int health2 ;
        while (!scanner.hasNextInt()) {
            System.out.println("That's not an integer, enter integer type:");
            scanner.next();
        }
        health2 = scanner.nextInt();
        System.out.println("Please enter damage of first player: ");
        int damage1 ;
        while (!scanner.hasNextInt()) {
            System.out.println("That's not an integer, enter integer type:");
            scanner.next();
        }
        damage1 = scanner.nextInt();
        System.out.println("Please enter damage of second player: ");
        int damage2 ;
        while (!scanner.hasNextInt()) {
            System.out.println("That's not an integer, enter integer type:");
            scanner.next();
        }
        damage2 = scanner.nextInt();

        Classes_Task_5 fighter1 = new Classes_Task_5(name1, health1, damage1);
        Classes_Task_5 fighter2 = new Classes_Task_5(name2, health2, damage2);
        int choise;
        System.out.println("Do you want to make 1-st player attack first?" +
                "\nPress 1 if YES" +
                "\nPress 0 if NO");
        while (!scanner.hasNext("[10]")) {
            System.out.println("You entered something which is not equal to 0 or 1. Try again: ");
            scanner.next();
        }
        choise = scanner.nextInt();


        String firstAtacker = "";
        switch (choise) {
            case 0: {
                firstAtacker = fighter2.name;
                break;
            }
            case 1: {
                firstAtacker = fighter1.name;
                break;
            }
        }
        System.out.println("And the winner is... ");
        System.out.println("-----------");
        System.out.println(declareWinner(fighter1, fighter2, firstAtacker));
        System.out.println("-----------");

    }

}
