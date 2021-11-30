package test.ConditionsTest;

import Conditions.AgeDiff;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgeDiffTest {

    @Test
    public void testAge() {

        assertEquals("You are 4 years old.", AgeDiff.calculateAge(2012, 2016));
        assertEquals("You are 27 years old.", AgeDiff.calculateAge(1989, 2016));
        assertEquals("You are 90 years old.", AgeDiff.calculateAge(2000, 2090));
    }
}
