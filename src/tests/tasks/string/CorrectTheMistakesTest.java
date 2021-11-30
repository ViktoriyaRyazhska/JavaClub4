package tests.tasks.string;

import application.tasks.string.CorrectTheMistakes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CorrectTheMistakesTest {
    CorrectTheMistakes correctTheMistakes = new CorrectTheMistakes();
    @Test
    void correctTest() {
        assertEquals("HellO, WOrld", correctTheMistakes.getCorrect("Hell0, W0rld"), "Hell0, W0rld");
        assertEquals("I am wOrld", correctTheMistakes.getCorrect("1 am w0rld"), "1 am w0rld");
    }
}