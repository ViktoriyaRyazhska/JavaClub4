package test_conditions;
import conditions.Conditions_task_12;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.runners.JUnit4;

public class Test_Conditions_Task_12 {
    @Test
    public void basicTests() {
        assertEquals("One", Conditions_task_12.switchItUp(1));
        assertEquals("Three", Conditions_task_12.switchItUp(3));
        assertEquals("Five", Conditions_task_12.switchItUp(5));
    }


    // Unxpected Result
    @Test
    public void basicTestsUnxpectetResult() {
        assertNotEquals("One", Conditions_task_12.switchItUp(3));
        assertNotEquals("Three", Conditions_task_12.switchItUp(9));
        assertNotEquals("Five", Conditions_task_12.switchItUp(2));
    }
}
