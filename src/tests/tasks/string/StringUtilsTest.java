package tests.tasks.string;

import application.tasks.string.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    StringUtils stringUtils = new StringUtils();
    @Test
    void toAlternativeStringTest() {
        assertEquals("HELLO, WORLD", stringUtils.getToAlternativeString("hello, world"), "hello, world");
        assertEquals("HEllO, WORlD", stringUtils.getToAlternativeString("heLLo, worLd"), "heLLo, worLd");
        assertEquals("HeLlO, wOrLd", stringUtils.getToAlternativeString("hElLo, WoRlD"), "hElLo, WoRlD");
    }
}