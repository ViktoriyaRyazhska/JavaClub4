package test_string;

import org.junit.Test;
import string.String_Task_3;

import static org.junit.Assert.assertEquals;


public class Test_String_Task_3 {

    @Test
    public void testHello() {
        String_Task_3 h = new String_Task_3();
        assertEquals(
                "Hello, John Smith! Welcome to Phoenix, Arizona!",
                h.sayHello("John Smith", "Phoenix", "Arizona")
        );
    }
}