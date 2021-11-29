package test_string;


import org.junit.Test;
import string.String_Task_13;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class Test_String_Task_13 {

    @Test
    public void testFixed() {
        assertEquals("S.H", String_Task_13.abbrevName("Sam Harris"));
        assertEquals("P.F", String_Task_13.abbrevName("Patrick Feenan"));
        assertEquals("E.C", String_Task_13.abbrevName("Evan Cole"));
        assertEquals("P.F", String_Task_13.abbrevName("P Favuzzi"));
        assertEquals("D.M", String_Task_13.abbrevName("David Mendieta"));
        assertNotEquals("M.K", String_Task_13.abbrevName("Oksana Klishch"));
        assertNotEquals("V.M", String_Task_13.abbrevName("Kola Klishch"));
        assertNotEquals("O.V", String_Task_13.abbrevName("David Mendieta"));
    }
}


