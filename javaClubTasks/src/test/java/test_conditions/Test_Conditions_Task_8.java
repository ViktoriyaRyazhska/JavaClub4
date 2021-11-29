package test_conditions;

import conditions.Conditions_task_8;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class Test_Conditions_Task_8 {
    @Test
    public void testOddAndEven() {
        assertEquals(true, Conditions_task_8.isLove(1, 4));
    }

    @Test
    public void testEvenAndEven() {
        assertEquals(false, Conditions_task_8.isLove(2, 2));
    }

    @Test
    public void testOddAndOdd() {
        assertEquals(false, Conditions_task_8.isLove(1, 1));
    }

    @Test
    public void testEvenAndOdd() {
        assertEquals(true, Conditions_task_8.isLove(0, 1));
    }


    // Unxpected Result
    @Test
    public void testOddAndEvenUnxpectedResult() {
        assertNotEquals(false, Conditions_task_8.isLove(1, 4));
    }

    @Test
    public void testEvenAndEvenUnxpectedResult() {
        assertNotEquals(true, Conditions_task_8.isLove(2, 2));
    }

    @Test
    public void testOddAndOddUnxpectedResult() {
        assertNotEquals(true, Conditions_task_8.isLove(1, 1));
    }

    @Test
    public void testEvenAndOddUnxpectedResult() {
        assertNotEquals(false, Conditions_task_8.isLove(0, 1));
    }
}
