package test_string;


import org.junit.Test;
import string.String_Task_1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class Test_String_Task_1 {
    @Test
    public void tests() {
        assertEquals("67", String_Task_1.numberToString(67));
        assertEquals("123", String_Task_1.numberToString(123));
        assertEquals("999", String_Task_1.numberToString(999));
        assertNotEquals("123", String_Task_1.numberToString(999));
        assertNotEquals("3251", String_Task_1.numberToString(1));
    }
}