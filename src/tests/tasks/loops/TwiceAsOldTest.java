package tests.tasks.loops;

import application.tasks.loops.TwiceAsOld;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwiceAsOldTest {
    TwiceAsOld twiceAsOld = new TwiceAsOld();

    @Test
    void twiceAsOldTest() {
        assertEquals("Father will be twice as old as his son in 30 year(s)", twiceAsOld.getOutPut(30, 0));
        assertEquals("Father will be twice as old as his son in 16 year(s)", twiceAsOld.getOutPut(30, 7));
        assertEquals("Father was twice as old as his son 15 year(s) ago", twiceAsOld.getOutPut(45, 30));
    }
}