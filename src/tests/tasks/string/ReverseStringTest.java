package tests.tasks.string;

import application.tasks.string.ReverseString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {
    ReverseString  reverseString = new ReverseString();
    @Test
    void reverseStringTest() {
        assertEquals("dlrow",reverseString.getRevers("world"));
    }
}