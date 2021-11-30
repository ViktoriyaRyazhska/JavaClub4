package tests.tasks.conditions;

import application.tasks.conditions.BooleanToString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BooleanToStringTest {
BooleanToString booleanToString = new BooleanToString();
    @Test
    void BooleanToStringTest() {
    assertEquals("true",booleanToString.getConverted(true));
    assertEquals("false",booleanToString.getConverted(false));
    }
}