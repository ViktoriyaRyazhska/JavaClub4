package test.BasicTest;

import Basic.Clock;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClockTest {

    @Test
    void past() {
        assertEquals(61000, Clock.Past(0,1,1));
    }
}