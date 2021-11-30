package tests.tasks.conditions;

import application.tasks.conditions.TheModuloSequence;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TheModuloSequenceTest {
TheModuloSequence theModuloSequence = new TheModuloSequence();
    @Test
    void theModuloSequenceTest() {
        assertEquals(2,theModuloSequence.getFindNth(20));
        assertEquals(2,theModuloSequence.getFindNth(148));
        assertEquals(2,theModuloSequence.getFindNth(111));
        assertEquals(2,theModuloSequence.getFindNth(118));
        assertEquals(0,theModuloSequence.getFindNth(41));
        assertEquals(0,theModuloSequence.getFindNth(85));
        assertEquals(0,theModuloSequence.getFindNth(117));
        assertEquals(1,theModuloSequence.getFindNth(82));
        assertEquals(1,theModuloSequence.getFindNth(72));
        assertEquals(1,theModuloSequence.getFindNth(5101394));
        assertEquals(1,theModuloSequence.getFindNth(163));
        assertEquals(1,theModuloSequence.getFindNth(90));
    }
}