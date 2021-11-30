package tests.tasks.string;

import application.tasks.string.NumberToString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberToStringTest {
    NumberToString numberToString = new NumberToString();
    @Test
    void numberToStringTest() {
        assertEquals("67",numberToString.getConvert(67));
        assertEquals("123",numberToString.getConvert(123));
        assertEquals("999",numberToString.getConvert(999));
    }
}