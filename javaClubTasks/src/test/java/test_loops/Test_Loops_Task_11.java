package test_loops;

import loops.Loops_Task_11;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Test_Loops_Task_11 {

    @Test
    public void twiceAsOld() {
        assertEquals(30, Loops_Task_11.TwiceAsOld(30,0));
        assertEquals(16, Loops_Task_11.TwiceAsOld(30,7));
        assertEquals(15, Loops_Task_11.TwiceAsOld(45,30));
    }
}