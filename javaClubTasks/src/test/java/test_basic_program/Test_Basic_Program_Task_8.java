package test_basic_program;

import basic_program.Basic_Program_Task_8;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runners.JUnit4;

public class Test_Basic_Program_Task_8 {
    @Test
    public void fixedTests() {
        assertTrue(Basic_Program_Task_8.isDivisible(4050,27));
        assertTrue(Basic_Program_Task_8.isDivisible(10000,20));
        assertTrue(Basic_Program_Task_8.isDivisible(10005,1));
        assertFalse(Basic_Program_Task_8.isDivisible(4066,27));
        assertFalse(Basic_Program_Task_8.isDivisible(10005,2));
    }
}
