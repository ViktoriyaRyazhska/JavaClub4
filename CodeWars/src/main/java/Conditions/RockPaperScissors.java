package Conditions;

public class RockPaperScissors {
    public static String rps(String p1, String p2) {
        if(p1 == "scissors" && p2 =="paper" || p1== "paper" && p2 =="rock" || p1 =="rock" && p2 =="scissors" ){
            return "Player 1 won!";
        }else if(p1 == "scissors" && p2 =="rock" || p1 =="rock" && p2 == "paper"|| p1 =="paper" && p2=="scissors"){
            return "Player 2 won!";
        }else {
            return "Draw!";
        }
    }
}

