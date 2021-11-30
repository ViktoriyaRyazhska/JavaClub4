package test.ConditionsTest;

import Conditions.BooleanToString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BooleanToStringTest {

    @Test
    public void testTrue(){
        assertEquals(BooleanToString.convert(true), "true");
    }

    @Test
    public void testFalse(){
        assertEquals(BooleanToString.convert(false), "false");
    }
}