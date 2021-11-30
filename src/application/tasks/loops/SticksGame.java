package application.tasks.loops;

import java.util.Scanner;

public class SticksGame {
    private int amountOfSticks = 21;

    private int getAmountOfSticks() {
        return amountOfSticks;
    }

    private void setAmountOfSticks(int amountOfSticks) {
        this.amountOfSticks = amountOfSticks;
    }

    private static void makeMove(SticksGame game, int n) {
        game.setAmountOfSticks(game.getAmountOfSticks() - n);
    }

    private static void robotMove(SticksGame game) {
        if (game.getAmountOfSticks() > 7 || game.getAmountOfSticks() <= 3) { // поки > 3 - забираємо три; або, якщо 3, то забираємо три
            makeMove(game, 3);
            System.out.println("- I`ll take three");
        } else if (game.getAmountOfSticks() == 6) {
                makeMove(game, 2);
                System.out.println("- I`ll take two");
        } else if (game.getAmountOfSticks() == 5) {
                makeMove(game, 1);
                System.out.println("- I`ll take one");
        }
    }

    private static void playerMove(SticksGame game, Scanner scanner) {
        System.out.print("Take some stick:\n> ");
        int n = scanner.nextInt();
        if (n > 0 && n <= 3) {
            makeMove(game, n);
        } else {
            System.out.println("Error.. don`t cheat!!!");
            playerMove(game, scanner);
        }
    }


    private static void game(Scanner scanner) {
        SticksGame game = new SticksGame();
        System.out.println("Sticks left: " + game.getAmountOfSticks());
        while(game.getAmountOfSticks() > 0) {
            robotMove(game);
            System.out.println("Sticks left: " + game.getAmountOfSticks());
            if (game.getAmountOfSticks() <= 0) {
                System.out.println("You lose((");
                break;
            }
            playerMove(game, scanner);
            System.out.println("Sticks left: " + game.getAmountOfSticks());
            if (game.getAmountOfSticks() <= 0) {
                System.out.println("You win!!!");
                break;
            }
        }
    }
    public int getSticksLeft(SticksGame game,int sticksTaken){
       //sticks left after move
       makeMove(game,sticksTaken);
       return game.amountOfSticks;

    }
    public static void task(Scanner scanner) {
        System.out.println("You can take 1, 2 or 3 sticks. The last who take stick(s) win");
        game(scanner);
    }
}
