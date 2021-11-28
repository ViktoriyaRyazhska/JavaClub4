package tests.basic;

import org.junit.Test;
import tasks.basic.IntegerToBinary;

import static org.junit.Assert.assertEquals;

public class IntegerToBinaryTest {
    @Test
    public void testToBinary() {
        IntegerToBinary integerToBinary = new IntegerToBinary();
        assertEquals(1, integerToBinary.toBinary(1));
        assertEquals(0, integerToBinary.toBinary(0));
        assertEquals(10, integerToBinary.toBinary(2));
        assertEquals(11, integerToBinary.toBinary(3));
        assertEquals(101, integerToBinary.toBinary(5));

    }
}
