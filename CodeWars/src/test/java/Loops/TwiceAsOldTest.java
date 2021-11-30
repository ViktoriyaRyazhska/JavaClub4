package Loops;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

class TwiceAsOldTest {
    @Test
    public void test() {
        assertEquals(16, TwiceAsOld.TwiceAsOld(20, 2));
        assertEquals(1, TwiceAsOld.TwiceAsOld(15, 4));
        assertEquals(26, TwiceAsOld.TwiceAsOld(30, 2));
    }
}