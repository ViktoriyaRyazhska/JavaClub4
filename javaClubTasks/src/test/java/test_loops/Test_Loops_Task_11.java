package test_loops;

import loops.Loops_Task_11;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class Test_Loops_Task_11 {

    @Test
    public void twiceAsOld() {
        assertEquals(30, Loops_Task_11.TwiceAsOld(30,0));
        assertEquals(16, Loops_Task_11.TwiceAsOld(30,7));
        assertEquals(15, Loops_Task_11.TwiceAsOld(45,30));
        assertNotEquals(30, Loops_Task_11.TwiceAsOld(35,12));
        assertNotEquals(20, Loops_Task_11.TwiceAsOld(40,50));
    }
}