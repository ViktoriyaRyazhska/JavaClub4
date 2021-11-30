package application.tasks.conditions;

import application.utility.ChoiceConditions;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.exit;

public class RockPaperScissors {
    //constants
    final static String ROCK = "r", SCISSORS = "s", PAPER = "p";
    final static String PLAYER1 = "First player", PLAYER2 = "Second player";

    //variable
    private static String result;

    private static String game(String firstPlayer, String secondPlayer) {
        //switch version
        if (firstPlayer.equals(secondPlayer))
            return result = "Draw!";
        else {
            switch (firstPlayer) {
                case ROCK:
                    if (secondPlayer == SCISSORS)
                        return result = "Player 1 wins!";
                    else
                        return result = "Player 2 wins!";
                case SCISSORS:
                    if (secondPlayer == PAPER)
                        return result = "Player 1 wins!";
                    else
                        return result = "Player 2 wins!";
                case PAPER:
                    if (secondPlayer == ROCK)
                        return result = "Player 1 wins!";
                    else
                        return result = "Player 2 wins!";
            }
        }
        return result;
    }
    private static void validate(String player, String playerPosition,Scanner in) {
        boolean validated = false;

        while (!validated) {
            if (player.equals(ROCK) || player.equals(PAPER) || player.equals(SCISSORS)) {
                System.out.println(playerPosition + " command is correct");
                validated = true;
                break;
            } else {
                System.out.println(playerPosition + " command is incorrect! Try again");
                RockPaperScissors.task(in);
            }
        }
    }

    public String getGame(String firstPlayer, String secondPlayer) {
        return game(firstPlayer, secondPlayer);
    }
    public void getValidate(String player, String playerPosition) {
        getValidate(player, playerPosition);
    }


    public static void task(Scanner in) {

        System.out.println("Here you can play Rock Paper Scissors with a friend.\n" +
                "Game usage rules: r - stands for Rock, s - stands for Scissors and p - stands for Paper.");

        System.out.print("First Player choose:\n > ");
        String firstPlayer = in.next().toLowerCase(Locale.ROOT);
        validate(firstPlayer, PLAYER1,in);

        System.out.print("Second Player choose:\n > ");
        String secondPlayer = in.next().toLowerCase(Locale.ROOT);

        validate(secondPlayer, PLAYER2,in);

        System.out.println(game(firstPlayer, secondPlayer));

        System.out.println("Do you want to play again?(1-yes, any other key - no)");
        in.nextLine();
        String playAgain = in.nextLine();
        if (playAgain.equals("1"))
            SwitchItUp.task(in);
        else
            ChoiceConditions.choiceConditions(in);
    }
}
