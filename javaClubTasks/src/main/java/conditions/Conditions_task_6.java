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
        System.out.println("Player's 1 turn. Enter 1. to pick 'scissors',2. 'paper' or 3. 'rock':");
        String p1 = "";
        int value1 = scanner.nextInt();
        switch(value1){
            case 1:{
                p1 = "scissors";
                break;
            }
            case 2:{
                p1 = "paper";
                break;
            }
            case 3:{
                p1 = "rock";
                break;
            }
        }
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Player's 2 turn. Enter 1. to pick 'scissors',2. 'paper' or 3. 'rock':");
        String p2 = "";
        int value2 = scanner1.nextInt();
        switch(value1){
            case 1:{
                p2 = "scissors";
                break;
            }
            case 2:{
                p2 = "paper";
                break;
            }
            case 3:{
                p2 = "rock";
                break;
            }
        }
        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(rps(p1,p2));
        System.out.println("-----------");

    }
}
