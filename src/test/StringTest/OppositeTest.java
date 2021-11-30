package test.StringTest;

import org.junit.jupiter.api.Test;
import String.OppositeNumber;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OppositeTest {
    @Test
    public void oppositeOf1() {
        assertEquals(-1, OppositeNumber.opposite(1));
    }

    @Test
    public void oppositeOf5() {
        assertEquals(-5, OppositeNumber.opposite(5));
    }

    @Test
    public void oppositeOfMinus15() {
        assertEquals(15, OppositeNumber.opposite(-15));
    }

    @Test
    public void oppositeOfZero() {
        assertEquals(0, OppositeNumber.opposite(0));
    }
}