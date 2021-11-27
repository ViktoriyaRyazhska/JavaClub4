package tests.conditions;

import application.tasks.conditions.RockPaperScissors;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class RockPaperScissorsTest {
    RockPaperScissors rockPaperScissors = new RockPaperScissors();
    @Test
    void gameTest() {
        try {
            Method method = RockPaperScissors.class.getDeclaredMethod("game", String.class, String.class);
            assertEquals("Draw!", method.invoke(rockPaperScissors, "r", "r"), "rock and rock");
            assertEquals("Draw!", method.invoke(rockPaperScissors, "s", "s"), "scissors and scissors");
            assertEquals("Draw!", method.invoke(rockPaperScissors, "p", "p"), "paper and paper");

            assertEquals("Player 1 wins!", method.invoke(rockPaperScissors, "r", "s"), "rock and scissors");
            assertEquals("Player 1 wins!", method.invoke(rockPaperScissors, "s", "p"), "scissors and paper");
            assertEquals("Player 1 wins!", method.invoke(rockPaperScissors, "p", "r"), "paper and rock");

            assertEquals("Player 2 wins!", method.invoke(rockPaperScissors, "r", "p"), "rock and paper");
            assertEquals("Player 2 wins!", method.invoke(rockPaperScissors, "p", "s"), "paper and scissors");
            assertEquals("Player 2 wins!", method.invoke(rockPaperScissors, "s", "r"), "scissors and rock");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void validateTest() {
        try {
            Method method = RockPaperScissors.class.getDeclaredMethod("validate", String.class, String.class);

            String result1 = "First player command is correct";
            assertEquals(result1, method.invoke(rockPaperScissors, "s", "First player"), "s");
            assertEquals(result1, method.invoke(rockPaperScissors, "r", "First player"), "r");
            assertEquals(result1, method.invoke(rockPaperScissors, "p", "First player"), "p");

            String result2 = "First player command is incorrect! Try again";
            assertEquals(result2, method.invoke(rockPaperScissors, "papirus", "First player"), "papirus");
            assertEquals(result2, method.invoke(rockPaperScissors, "cutter", "First player"), "cutter");
            assertEquals(result2, method.invoke(rockPaperScissors, "stone", "First player"), "stone");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}