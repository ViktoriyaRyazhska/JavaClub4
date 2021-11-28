package test_conditions;


import conditions.Conditions_task_1;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test_Conditions_Task_1 {
    @Test
    public void tests() {
        assertEquals(-1, Conditions_task_1.opposite(1));
    }
}
