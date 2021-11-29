package test_loops;


import loops.Loops_Task_5;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.runners.JUnit4;


public class Test_Loops_Task_5 {
    Boolean[] array1 = {true, true, true, false,
            true, true, true, true,
            true, false, true, false,
            true, false, false, true,
            true, true, true, true,
            false, false, true, true};

    @Test
    public void test() {
        assertEquals("There are 17 sheeps in total", 17, new Loops_Task_5().countSheeps(array1));
        assertNotEquals( 29, new Loops_Task_5().countSheeps(array1));
    }
}