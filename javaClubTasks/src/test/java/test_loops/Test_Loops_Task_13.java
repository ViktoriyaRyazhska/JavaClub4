package test_loops;

import static org.junit.Assert.assertEquals;

import loops.Loops_Task_13;
import org.junit.Test;

public class Test_Loops_Task_13 {
    @Test
    public void test1() {
        assertEquals(1,
                Loops_Task_13.summation(1));
    }

    @Test
    public void test2() {
        assertEquals(36,
                Loops_Task_13.summation(8));
    }
}
