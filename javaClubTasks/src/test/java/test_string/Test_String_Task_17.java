package test_string;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import string.String_Task_17;

import static org.junit.Assert.*;

public class Test_String_Task_17 {
    @Test
    public void fixedTests() {
        assertEquals("HELLO WORLD", String_Task_17.toAlternativeString("hello world"));
        assertEquals("hello world", String_Task_17.toAlternativeString("HELLO WORLD"));
        assertEquals("12345", String_Task_17.toAlternativeString("12345"));
        assertEquals("sTRINGuTILS.TOaLTERNATINGcASE", String_Task_17.toAlternativeString("StringUtils.toAlternatingCase"));
    }

    @Test
    public void kataTitleTests() {
        assertEquals("ALTerNAtiNG CaSe", String_Task_17.toAlternativeString("altERnaTIng cAsE"));
        assertEquals("altERnaTIng cAsE", String_Task_17.toAlternativeString("ALTerNAtiNG CaSe"));
        assertEquals("ALTerNAtiNG CaSe <=> altERnaTIng cAsE", String_Task_17.toAlternativeString("altERnaTIng cAsE <=> ALTerNAtiNG CaSe"));
    }


    // Unxpected Result
    @Test
    public void testUnxpectedResult() {
        assertNotEquals("Alternating CaSe", String_Task_17.toAlternativeString("altERnaTIng cAsE"));
        assertNotEquals("altERnaTIng case", String_Task_17.toAlternativeString("ALTerNAtiNG CaSe"));
        assertNotEquals("HELLO world", String_Task_17.toAlternativeString("HELLO WORLD"));
        assertNotEquals("123456", String_Task_17.toAlternativeString("12345"));
    }

}
