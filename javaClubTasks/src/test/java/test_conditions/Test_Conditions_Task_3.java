package test_conditions;

import conditions.Conditions_Task_3;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class Test_Conditions_Task_3 {

    @Test
    public void convert() {
        assertEquals(Conditions_Task_3.convert(true), "true");
        assertEquals(Conditions_Task_3.convert(false), "false");
        assertNotEquals(Conditions_Task_3.convert(false), "true");
        assertNotEquals(Conditions_Task_3.convert(true), "false");
    }


}