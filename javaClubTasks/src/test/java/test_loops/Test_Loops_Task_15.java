package test_loops;

import loops.Loops_Task_15;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class Test_Loops_Task_15 {

    @Test
    public void testMove() {
        assertEquals(3, Loops_Task_15.makeMove(3));
        assertEquals(0, Loops_Task_15.makeMove(4));
        assertNotEquals(5, Loops_Task_15.makeMove(1));
        assertNotEquals(5, Loops_Task_15.makeMove(2));
    }
}