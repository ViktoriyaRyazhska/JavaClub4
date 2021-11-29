package test_loops;

import loops.Loops_Task_7;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class Test_Loops_Task_7 {

    @Test
    public void betterAverage() {
        assertEquals(true, Loops_Task_7.betterThanAverage(new int[] {2, 3}, 5));
        assertEquals(true, Loops_Task_7.betterThanAverage(new int[] {100, 40, 34, 57, 29, 72, 57, 88}, 75));
        assertEquals(true, Loops_Task_7.betterThanAverage(new int[] {12, 23, 34, 45, 56, 67, 78, 89, 90}, 69));
        assertEquals(false, Loops_Task_7.betterThanAverage(new int[] {100, 90}, 11));
        assertNotEquals(true, Loops_Task_7.betterThanAverage(new int[] {78, 99}, 12));
        assertNotEquals(true, Loops_Task_7.betterThanAverage(new int[] {45, 67,70}, 10));
    }


}