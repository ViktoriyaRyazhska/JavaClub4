package test_conditions;

import conditions.Conditions_Task_13;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class Test_Conditions_Task_13 {

    @Test
    public void updateLight() {
        assertEquals("green", Conditions_Task_13.updateLight("red"));
        assertEquals("yellow", Conditions_Task_13.updateLight("green"));
        assertEquals("red", Conditions_Task_13.updateLight("yellow"));
        assertNotEquals("green", Conditions_Task_13.updateLight("yellow"));
        assertNotEquals("red", Conditions_Task_13.updateLight("green"));
    }
}