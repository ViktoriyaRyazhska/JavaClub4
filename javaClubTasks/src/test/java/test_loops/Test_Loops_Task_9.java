package test_loops;


import loops.Loops_Task_9;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.runners.JUnit4;


public class Test_Loops_Task_9 {
    @Test
    public void testSomething() {
        assertEquals(15, Loops_Task_9.sum(new int[]{1, 2, 3, 4, 5}));
        assertEquals(13, Loops_Task_9.sum(new int[]{1, -2, 3, 4, 5}));
        assertEquals(0, Loops_Task_9.sum(new int[]{}));
        assertEquals(0, Loops_Task_9.sum(new int[]{-1, -2, -3, -4, -5}));
        assertEquals(9, Loops_Task_9.sum(new int[]{-1, 2, 3, 4, -5}));
        assertNotEquals(3456, Loops_Task_9.sum(new int[]{-1, 2, 3, 4, -5}));
        assertNotEquals(6, Loops_Task_9.sum(new int[]{-1, -2, -3, -4, -5}));
    }
}
