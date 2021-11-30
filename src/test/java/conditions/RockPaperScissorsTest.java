package conditions;

import org.junit.Test;
import tasks.conditions.RockPaperScissors;

import static org.junit.Assert.assertEquals;

public class RockPaperScissorsTest {

    @Test
    public void rockPaperScissorsTest() {
        System.out.println("Fixed Tests Player 1 won!");
        assertEquals("Player 1 won!", RockPaperScissors.rps("rock", "scissors"));
        assertEquals("Player 1 won!", RockPaperScissors.rps("scissors", "paper"));
        assertEquals("Player 1 won!", RockPaperScissors.rps("paper", "rock"));

        System.out.println("Fixed Tests Player 2 won!");
        assertEquals("Player 2 won!", RockPaperScissors.rps("scissors", "rock"));
        assertEquals("Player 2 won!", RockPaperScissors.rps("paper", "scissors"));
        assertEquals("Player 2 won!", RockPaperScissors.rps("rock", "paper"));

        System.out.println("Fixed Tests Draw!");
        assertEquals("Draw!", RockPaperScissors.rps("scissors", "scissors"));
        assertEquals("Draw!", RockPaperScissors.rps("paper", "paper"));
        assertEquals("Draw!", RockPaperScissors.rps("rock", "rock"));
    }
}
