package tests.tasks.string;

import application.tasks.string.CorrectTheMistakes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CorrectTheMistakesTest {
    CorrectTheMistakes correctTheMistakes = new CorrectTheMistakes();
    @Test
    void correctTest() {
       assertEquals("HELLO, WORLD", correctTheMistakes.getCorrect("HELL0, W0RLD"), "Hell0, W0rld");
       assertEquals("I am world", correctTheMistakes.getCorrect("1 am world"), "1 am w0rld");
       assertEquals("Some", correctTheMistakes.getCorrect("5ome"));
    }
}