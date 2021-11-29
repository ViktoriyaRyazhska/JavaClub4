package test_conditions;
import conditions.Conditions_task_2;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test_Conditions_Task_2 {
    @Test
    public void test1() {
        assertEquals(true, Conditions_task_2.isDivisible(12,4,3));
        assertNotEquals(false, Conditions_task_2.isDivisible(12,4,3));
    }
    @Test
    public void test2() {
        assertEquals(false, Conditions_task_2.isDivisible(3,3,4));
    }
}
