package test_conditions;
import conditions.Conditions_task_10;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test_Conditions_Task_10 {
    @Test
    public void testBob() {
        assertEquals("Should return 0.", 0, Conditions_task_10.enough(10, 5, 5));
        assertEquals("Should return 10.", 10, Conditions_task_10.enough(100, 60, 50));
        assertEquals("Should return 0.", 0, Conditions_task_10.enough(20, 5, 5));
        assertNotEquals("Should return 80.", 8, Conditions_task_10.enough(10, 5, 5));
        assertNotEquals("Should return 8101.", 810, Conditions_task_10.enough(100, 60, 50));
        assertNotEquals("Should return 810.", 80, Conditions_task_10.enough(20, 5, 5));
    }
}
