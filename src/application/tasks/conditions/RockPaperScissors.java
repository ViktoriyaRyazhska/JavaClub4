package application.tasks.conditions;

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
    private static void validate(String player, String playerPosition) {
        boolean validated = false;

        while (!validated) {
            if (player.equals(ROCK) || player.equals(PAPER) || player.equals(SCISSORS)) {
                System.out.println(playerPosition + " command is correct");
                validated = true;
                break;
            } else {
                System.out.println(playerPosition + " command is incorrect! Try again");
                RockPaperScissors.task();
            }
        }
    }

    public static void task() {
        Scanner in = new Scanner(System.in);
        System.out.println("Here you can play Rock Paper Scissors with a friend.\n" +
                "Game usage rules: r - stands for Rock, s - stands for Scissors and p - stands for Paper.");

        System.out.println("First Player choose:\n > ");
        String firstPlayer = in.next().toLowerCase(Locale.ROOT);
        validate(firstPlayer, PLAYER1);

        System.out.println("Second Player choose:\n > ");
        String secondPlayer = in.next().toLowerCase(Locale.ROOT);

        validate(secondPlayer, PLAYER2);

        System.out.println(game(firstPlayer, secondPlayer));

        System.out.println("Do you want to play again?(1-yes, any other key - no)");
        int playAgain = in.nextInt();
        if (playAgain == 1)
            RockPaperScissors.task();
        else
            exit(0);
    }
}
