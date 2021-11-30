package string;

import org.junit.Test;
import tasks.string.AlternativeString;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class AlternativeStringTest {
    @Test
    public void fixedTests() {
        assertEquals("HELLO WORLD", AlternativeString.toAlternativeString("hello world"));
        assertEquals("hello world", AlternativeString.toAlternativeString("HELLO WORLD"));
        assertEquals("HELLO world", AlternativeString.toAlternativeString("hello WORLD"));
        assertEquals("hEllO wOrld", AlternativeString.toAlternativeString("HeLLo WoRLD"));
        assertEquals("Hello World", AlternativeString.toAlternativeString(AlternativeString.toAlternativeString("Hello World")));
        assertEquals("12345", AlternativeString.toAlternativeString("12345"));
        assertEquals("1A2B3C4D5E", AlternativeString.toAlternativeString("1a2b3c4d5e"));
        assertEquals("sTRINGuTILS.TOaLTERNATINGcASE", AlternativeString.toAlternativeString("StringUtils.toAlternatingCase"));
    }

    @Test
    public void taskTitleTests() {
        assertEquals("ALTerNAtiNG CaSe", AlternativeString.toAlternativeString("altERnaTIng cAsE"));
        assertEquals("altERnaTIng cAsE", AlternativeString.toAlternativeString("ALTerNAtiNG CaSe"));
        assertEquals("ALTerNAtiNG CaSe <=> altERnaTIng cAsE", AlternativeString.toAlternativeString("altERnaTIng cAsE <=> ALTerNAtiNG CaSe"));
        assertEquals("altERnaTIng cAsE <=> ALTerNAtiNG CaSe", AlternativeString.toAlternativeString("ALTerNAtiNG CaSe <=> altERnaTIng cAsE"));
    }
}
