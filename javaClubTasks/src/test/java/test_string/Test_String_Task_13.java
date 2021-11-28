package test_string;


import org.junit.Test;
import string.String_Task_13;

import static org.junit.Assert.assertEquals;


public class Test_String_Task_13 {

    @Test
    public void testFixed() {
        assertEquals("S.H", String_Task_13.abbrevName("Sam Harris"));
        assertEquals("P.F", String_Task_13.abbrevName("Patrick Feenan"));
        assertEquals("E.C", String_Task_13.abbrevName("Evan Cole"));
        assertEquals("P.F", String_Task_13.abbrevName("P Favuzzi"));
        assertEquals("D.M", String_Task_13.abbrevName("David Mendieta"));
    }
}


