package basic;

import org.junit.Test;
import tasks.basic.NegativeNumber;

import static org.junit.Assert.*;

public class NegativeNumberTest {
    @Test(expected = Exception.class)
    public void test1() {
        Object object = null;
        assertEquals(-42, NegativeNumber.negativeNumber(42));
        assertEquals(-1, NegativeNumber.negativeNumber(1));
        assertEquals(0, NegativeNumber.negativeNumber(0));
        assertNotEquals(1, NegativeNumber.negativeNumber(1));
        assertNotEquals(0, NegativeNumber.negativeNumber(5));
        assertNotEquals(5, NegativeNumber.negativeNumber(-5));
        assertNull( NegativeNumber.negativeNumber((int)object));
    }
}
