package tests.basic;

import org.junit.Test;
import tasks.basic.TimePastAfterMidnight;

import static org.junit.Assert.assertEquals;

public class TimePastAfterMidnightTest {
    @Test
    public void test1(){

        assertEquals(61000, TimePastAfterMidnight.timePastAfterMidnight(0,1,1));
    }
}
