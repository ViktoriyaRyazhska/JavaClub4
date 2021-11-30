package loops;

import org.junit.Test;
import tasks.loops.StringRepeat;

import static org.junit.Assert.assertEquals;

public class StringRepeatTest {

    @Test
    public void stringRepeatTest() {
        assertEquals("aaaa", StringRepeat.repeatStr(4, "a"));
        assertEquals("HelloHelloHello", StringRepeat.repeatStr(3, "Hello"));
        assertEquals("", StringRepeat.repeatStr(5, ""));
        assertEquals("", StringRepeat.repeatStr(0, "kata"));
    }
}
