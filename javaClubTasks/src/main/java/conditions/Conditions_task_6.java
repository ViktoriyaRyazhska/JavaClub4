package conditions;

import java.util.Scanner;

public class Conditions_task_6 {
    public static String rps(String p1, String p2) {
        if(p1 == "scissors" && p2 == "paper" || p1 == "rock" && p2 == "scissors" ||p1 == "paper" && p2 == "rock") {
            return "Player 1 won!";
        }
        if(p1 == "scissors" && p2 == "rock" || p1 == "paper" && p2 == "scissors"  || p1 == "rock" && p2 == "paper") {
            return "Player 2 won!";
        }
        if(p1 == "scissors" && p2 == "scissors" || p1 == "rock" && p2 == "rock" || p1 == "paper" && p2 == "paper") {
            return "Draw!";
        }else return "invalid data";
    }
    public static void solveTask(){
        System.out.println("Let's play! Rock Paper Scissors");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player 1 turn. Enter 'scissors', 'paper' or 'rock':");
        String value1 = scanner.nextLine();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Player 2 turn. Enter 'scissors', 'paper' or 'rock':");
        String value2 = scanner1.nextLine();

        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(rps(value1,value2));
        System.out.println("-----------");

    }
}
