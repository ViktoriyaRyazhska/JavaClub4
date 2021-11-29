package test_string;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.runners.JUnit4;
import string.String_Task_9;

public class Test_String_Task_9 {
    @Test
    public void basicTests() {
        assertEquals("Position of alphabet: 1", String_Task_9.position('a'));
        assertEquals("Position of alphabet: 26", String_Task_9.position('z'));
        assertEquals("Position of alphabet: 5", String_Task_9.position('e'));
        assertNotEquals("Position of alphabet: 1", String_Task_9.position('z'));
        assertNotEquals("Position of alphabet: 26", String_Task_9.position('a'));
    }
}