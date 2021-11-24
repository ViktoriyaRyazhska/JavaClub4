package Conditions;

import org.junit.Assert;
import org.junit.Test;

public class RockPaperScissorsTest {
    @Test
    public void testPlayer1Win() {
        Assert.assertEquals("Player 1 won!", RockPaperScissors.rps("scissors", "paper"));
        Assert.assertEquals("Player 1 won!", RockPaperScissors.rps("rock", "scissors"));
        Assert.assertEquals("Player 1 won!", RockPaperScissors.rps("paper", "rock"));
    }

    @Test
    public void testPlayer2Win() {
        Assert.assertEquals("Player 2 won!", RockPaperScissors.rps("paper", "scissors"));
        Assert.assertEquals("Player 2 won!", RockPaperScissors.rps("scissors", "rock"));
        Assert.assertEquals("Player 2 won!", RockPaperScissors.rps("rock", "paper"));
    }
    @Test
    public void testDraw() {
        Assert.assertEquals("Draw!", RockPaperScissors.rps("paper", "paper"));
        Assert.assertEquals("Draw!", RockPaperScissors.rps("rock", "rock"));
        Assert.assertEquals("Draw!", RockPaperScissors.rps("paper", "paper"));
        Assert.assertEquals("Draw!", RockPaperScissors.rps("scissors", "scissors"));
    }
}
