package test_loops;

import loops.Loops_Task_3;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class Test_Loops_Task_3 {

    @Test
    public void testAverage() {
        assertEquals(2, Loops_Task_3.getAverage(new int[] {2,2,2,2}));
        assertEquals(3,Loops_Task_3.getAverage(new int[] {1,2,3,4,5}));
        assertEquals(1,Loops_Task_3.getAverage(new int[] {1,1,1,1,1,1,1,2}));
        assertNotEquals(3,Loops_Task_3.getAverage(new int[] {5,5,4,4,3}));
        assertNotEquals(2,Loops_Task_3.getAverage(new int[] {2,4,3,3,5}));
    }


}