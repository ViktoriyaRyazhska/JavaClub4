package test.BasicTest;
import Basic.DoubleInteger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleIntegerTest {

    @Test
    void doubleInteger() {
        assertEquals(4, DoubleInteger.doubleInteger(2));
        assertEquals(8, DoubleInteger.doubleInteger(4));
    }
}