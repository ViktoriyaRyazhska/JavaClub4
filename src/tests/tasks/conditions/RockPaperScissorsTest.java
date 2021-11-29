package tests.tasks.conditions;

import application.tasks.conditions.RockPaperScissors;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RockPaperScissorsTest {
    RockPaperScissors rockPaperScissors = new RockPaperScissors();
    @Test
    void gameTest() {
        String result1 = "Draw!";
        String result2 = "Player 1 wins!";
        String result3 = "Player 2 wins!";

        assertEquals(result1, rockPaperScissors.getGame("r", "r"), "r, r");
        assertEquals(result1, rockPaperScissors.getGame("p", "p"), "p, p");
        assertEquals(result1, rockPaperScissors.getGame("s", "s"), "s, s");

        assertEquals(result2, rockPaperScissors.getGame("r", "s"), "r, s");
        assertEquals(result2, rockPaperScissors.getGame("p", "r"), "p, r");
        assertEquals(result2, rockPaperScissors.getGame("s", "p"), "s, p");

        assertEquals(result3, rockPaperScissors.getGame("s", "r"), "s, r");
        assertEquals(result3, rockPaperScissors.getGame("r", "p"), "r, p");
        assertEquals(result3, rockPaperScissors.getGame("p", "s"), "p, s");

    }
}