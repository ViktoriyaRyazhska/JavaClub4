package test_oop;


import oop.Human;
import oop.Man;
import oop.OOP_Task_1;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class Test_OOP_Task_1 {
    @Test
    public void makingAdam() {
        Human[] paradise = OOP_Task_1.create();
        assertEquals("Adam are a man", true, paradise[0] instanceof Man);
        assertNotEquals(false, paradise[0] instanceof Man);
    }
}