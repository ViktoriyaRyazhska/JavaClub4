package test.ConditionsTest;

import Conditions.OppositeNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OppositeNumberTest {

    @Test
    void minusOne() {
        int expected = -1;
        int result = OppositeNumber.opposite(1);
        assertEquals(expected, result);
    }

    @Test
    void plusTwo() {
        int expected = 2;
        int result = OppositeNumber.opposite(-2);
        assertEquals(expected, result);
    }

    @Test
    void PlusTen() {
        int expected = 10;
        int result = OppositeNumber.opposite(-10);
        assertEquals(expected, result);
    }


}