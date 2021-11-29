package test_basic_program;

import basic_program.Basic_Program_Task_7;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class Test_Basic_Program_Task_7 {

    @Test
    public void testPast() {
        assertEquals(61000, Basic_Program_Task_7.Past(0,1,1));
        assertEquals(12192000, Basic_Program_Task_7.Past(3,23,12));
        assertNotEquals(730002, Basic_Program_Task_7.Past(2,45,21));
        assertNotEquals(991230, Basic_Program_Task_7.Past(0,24,9));
    }
}