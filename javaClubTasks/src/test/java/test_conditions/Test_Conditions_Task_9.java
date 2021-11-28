package test_conditions;


import conditions.Conditions_task_9;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.runners.JUnit4;

public class Test_Conditions_Task_9 {
    @Test
    public void testBoolToWord() {
        assertEquals(Conditions_task_9.boolToWord(true), "Yes");
        assertEquals(Conditions_task_9.boolToWord(false), "No");
    }
}
