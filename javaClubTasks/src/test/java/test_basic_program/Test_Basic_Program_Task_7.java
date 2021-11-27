package test_basic_program;

import basic_program.Basic_Program_Task_7;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class Test_Basic_Program_Task_7 {

    @Test
    public void testPast() {
        assertEquals(61000, Basic_Program_Task_7.Past(0,1,1));
    }
}