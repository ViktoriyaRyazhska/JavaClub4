package Loops.TwentyOne;

import java.util.Scanner;

public class Main {
    public static void main(final String args) {
        final Scanner scanner = new Scanner(System.in);

        int stick = 21, player, computer;

        System.out.println("Choose how many sticks take(1, 2 or 3): ");
        computer = 1;
        stick -= computer;
        System.out.println("Computer takes " + computer + " --> " + stick + " sticks left");

        while (stick > 0) {
            player = scanner.nextInt();
            stick -= player;
            System.out.println("Player takes " + player + " --> " + stick + " sticks left");
            if (stick <= 0) {
                System.out.println("Player loose");
            } else if(stick >= 5){
                computer = 5 - player;
                stick -= computer;
                System.out.println("Computer takes " + computer + " --> " + stick + " sticks left");
                if (stick <= 0) {
                    System.out.println("Computer loose");
                }
            } else{
                computer = stick;
                stick -= stick;
                System.out.println("Computer takes " + computer + " --> " + stick + " sticks left");
                System.out.println("Player loose");
            }
        }
    }
}
