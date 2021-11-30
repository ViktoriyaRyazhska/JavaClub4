package Loops;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

class StringRepeatTest {
    @Test
    public void test() {
        assertEquals("TestTest", StringRepeat.repeatStr(2,"Test"));
        assertEquals("TestTestTest", StringRepeat.repeatStr(3,"Test"));
    }
}