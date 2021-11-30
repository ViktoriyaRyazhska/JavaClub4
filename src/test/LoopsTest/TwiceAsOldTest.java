package test.LoopsTest;

import Loops.TwiceAsOld;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TwiceAsOldTest {
    @Test
    public void testSomething() {
        assertEquals(30, TwiceAsOld.twiceAsOld(30,0));
        assertEquals(16, TwiceAsOld.twiceAsOld(30,7));
        assertEquals(15, TwiceAsOld.twiceAsOld(45,30));
    }
}