package test_string;


import org.junit.Test;
import string.String_Task_5;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class Test_String_Task_5 {

    @Test
    public void testSomeDots() {
        assertTrue("Sorry, try again :-(", "one-two-three".equals(String_Task_5.replaceDots("one.two.three")));
        assertNotEquals("hello-world", String_Task_5.replaceDots("one.two.three"));
    }

}