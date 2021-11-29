package test_string;

import org.junit.Test;
import string.String_Task_11;

import static org.junit.Assert.assertEquals;


public class Test_String_Task_11 {

    @Test
    public void howOld() {
        assertEquals(5, String_Task_11.howOld("5 years old"));
        assertEquals(7, String_Task_11.howOld("7 years old"));
        assertEquals(9, String_Task_11.howOld("9 years old"));
        assertEquals(6, String_Task_11.howOld("6 years old"));
    }
}