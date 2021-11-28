package tests.basic;

import org.junit.Test;
import tasks.basic.IntegerToBinary;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class IntegerToBinaryTest {
    @Test (expected = Exception.class)
    public void testToBinary() {
        IntegerToBinary integerToBinary = new IntegerToBinary();
        Object object = null;
        assertEquals(1, integerToBinary.toBinary(1));
        assertEquals(0, integerToBinary.toBinary(0));
        assertEquals(10, integerToBinary.toBinary(2));
        assertEquals(11, integerToBinary.toBinary(3));
        assertEquals(101, integerToBinary.toBinary(5));
        assertNull( integerToBinary.toBinary((int)object));

    }
}
