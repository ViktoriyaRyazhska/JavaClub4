package tests.tasks.string;

import application.tasks.string.ReplaceDots;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceDotsTest {
    ReplaceDots replaceDots = new ReplaceDots();
    @Test
    void replaceDotsTest() {
        assertTrue("one-two-three".equals(replaceDots.getReplacedDots("one.two.three")), "Sorry, try again :-(");
    }
}