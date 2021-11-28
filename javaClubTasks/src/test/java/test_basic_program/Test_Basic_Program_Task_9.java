package test_basic_program;


import basic_program.Basic_Program_Task_9;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test_Basic_Program_Task_9 {

    @Test
    public void test1() {
        assertEquals(-42, Basic_Program_Task_9.makeNegative(42));
    }
}