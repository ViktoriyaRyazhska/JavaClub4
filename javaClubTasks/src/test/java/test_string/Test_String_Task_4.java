package test_string;
import org.junit.Test;
import string.String_Task_4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class Test_String_Task_4 {
    @Test
    public void tests() {
        assertEquals(-1, String_Task_4.opposite(1));
        assertEquals(10, String_Task_4.opposite(-10));
    }


    // Unxpected Result
    @Test
    public void testsUnxpectedResult() {
        assertNotEquals(41, String_Task_4.opposite(1));
        assertNotEquals(55, String_Task_4.opposite(-10));
    }
}
