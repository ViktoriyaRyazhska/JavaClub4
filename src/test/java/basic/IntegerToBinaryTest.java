package test.java.basic;

import org.junit.Test;
import tasks.basic.IntegerToBinary;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class IntegerToBinaryTest {
    @Test (expected = Exception.class)
    public void testToBinary() {
        Object object = null;
        assertEquals(1, IntegerToBinary.toBinary(1));
        assertEquals(0, IntegerToBinary.toBinary(0));
        assertEquals(10, IntegerToBinary.toBinary(2));
        assertEquals(11, IntegerToBinary.toBinary(3));
        assertEquals(101, IntegerToBinary.toBinary(5));
        assertNull( IntegerToBinary.toBinary((int)object));

    }
}
