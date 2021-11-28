package test_conditions;

import conditions.Conditions_Task_11;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Test_Conditions_Task_11 {

    @Test
    public void testSequence() {
        assertEquals(2, Conditions_Task_11.sequence(20));
        assertEquals(2, Conditions_Task_11.sequence(148));
        assertEquals(2, Conditions_Task_11.sequence(111));
        assertEquals(2, Conditions_Task_11.sequence(118));
        assertEquals(0, Conditions_Task_11.sequence(41));
        assertEquals(0, Conditions_Task_11.sequence(85));
        assertEquals(0, Conditions_Task_11.sequence(117));
        assertEquals(1, Conditions_Task_11.sequence(82));
        assertEquals(1, Conditions_Task_11.sequence(72));
        assertEquals(1, Conditions_Task_11.sequence(5101394));
        assertEquals(1, Conditions_Task_11.sequence(163));
        assertEquals(1, Conditions_Task_11.sequence(90));
    }
}