package conditions;

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
}
