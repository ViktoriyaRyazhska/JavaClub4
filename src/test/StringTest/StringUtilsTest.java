package test.StringTest;

import org.junit.Test;
import String.StringUtils;
import static org.junit.Assert.*;

public class StringUtilsTest {

    @Test
    public void fixedTests() {
        assertEquals("HELLO WORLD", StringUtils.toAlternativeString("hello world"));
        assertEquals("hEllO wOrld", StringUtils.toAlternativeString("HeLLo WoRLD"));
        assertEquals("Hello World", StringUtils.toAlternativeString(StringUtils.toAlternativeString("Hello World")));

    }

    @Test
    public void kataTitleTests() {
        assertEquals("ALTerNAtiNG CaSe", StringUtils.toAlternativeString("altERnaTIng cAsE"));
        assertEquals("altERnaTIng cAsE", StringUtils.toAlternativeString("ALTerNAtiNG CaSe"));
        assertEquals("ALTerNAtiNG CaSe <=> altERnaTIng cAsE", StringUtils.toAlternativeString("altERnaTIng cAsE <=> ALTerNAtiNG CaSe"));
        assertEquals("altERnaTIng cAsE <=> ALTerNAtiNG CaSe", StringUtils.toAlternativeString("ALTerNAtiNG CaSe <=> altERnaTIng cAsE"));
    }
}